import java.util.*;

public class practice {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : nums)
            count.merge(num, 1, Integer::sum);

        for (int key : count.keySet()) {
            int freq = count.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
        }

        int index = 0;
        int[] result = new int[k];
        for (int i = nums.length; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int val : bucket[i]) {
                    result[index++] = val;
                    if (index == k)
                        return result;
                }
            }
        }

        return result;
    }
}
