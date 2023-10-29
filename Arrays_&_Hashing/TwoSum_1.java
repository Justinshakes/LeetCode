import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {


    public static void main(String[] args) {
        int[] nums1 = {2, 1, 5, 3};
        int target1 = 4;
        System.out.println(Arrays.toString(twoSum(nums1, target1))); // Should print [1, 3]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2, target2))); // Should print [1, 2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums3, target3))); // Should print [0, 1]

        int[] nums4 = {0, 4, 3, 0};
        int target4 = 0;
        System.out.println(Arrays.toString(twoSum(nums4, target4))); // Should print [0, 3]
    }



    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(diff))
                return new int[]{map.get(diff), i};

            map.put(num, i);
        }

        return null;
    }

}


