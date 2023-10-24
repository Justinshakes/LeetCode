import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {


    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 3};

        System.out.println(Arrays.toString(twoSum(nums, 4)));

    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length; // Cache the length

        for (int i = 0; i < length; i++) {
            int num = nums[i]; // Cache the current number
            int diff = target - num;

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(num, i);
        }
        return null;
    }

}


