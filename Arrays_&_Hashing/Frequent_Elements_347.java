import java.util.*;

// Last Practiced: Nov 10th 2023

public class Frequent_Elements_347 {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : nums)
            count.merge(num, 1, Integer::sum);

        System.out.println(count.keySet());
        System.out.println(count);

        for (int key : count.keySet()) {
            int freq = count.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        int index = 0;
        int[] result = new int[k];
        for (int i = nums.length; i >= 0; i--) {
            if (bucket[i] != null)
                for (int val : bucket[i]) {
                    result[index++] = val;
                    if (index == k)
                        return result;
                }
        }
        return result;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {1, 1, 1, 2, 2, 3, 1, 2};
        int k1 = 2;
        int[] result1 = topKFrequent(nums1, k1);
        System.out.println(Arrays.toString(result1)); // Expected output: [1, 2]

        // Test Case 2
//        int[] nums2 = {1, 1, 1, 2, 2, 3, 3, 3, 3}
//        int k2 = 2;
//        int[] result2 = topKFrequent(nums2, k2);
//        System.out.println(Arrays.toString(result2)); // Expected output: [3, 1]
//
//        // Test Case 3
//        int[] nums3 = {4, 1, -1, 2, -1, 2, 3};
//        int k3 = 2;
//        int[] result3 = topKFrequent(nums3, k3);
//        System.out.println(Arrays.toString(result3)); // Expected output: [-1, 2]

        // Add more test cases as needed to cover various scenarios.


//        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4};
//        Map<Integer, Integer> count = new HashMap<>();
//
//
////        Integer::sum is a method reference in Java.It's used to refer to a method in the Integer class. In this case, it refers to the static
////        method sum in the Integer class, which is used to add two integers together.
//
//        for (int num : nums) {
//            // Using count.merge to update the count of each element
//            count.merge(num, 1, Integer::sum);
//        }
//
//        // Print the frequency of each element
//        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
//            int num = entry.getKey();
//            int frequency = entry.getValue();
//            System.out.println("Element " + num + " appears " + frequency + " times.");
//        }

    }
}
