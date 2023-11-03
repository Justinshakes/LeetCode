import java.util.*;

public class practice {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if(map.containsKey(diff))
                return new int[]{map.get(diff), i};

            map.put(num, i);
        }
        return null;

    }
    public static void main(String[] args) {

    }
}
