import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_217 {

//    public boolean containsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i : nums) {
//            int count = map.getOrDefault(i, 0);
//            map.put(i, count + 1);
//        }
//
//        for(int i : nums) {
//            if(map.get(i) > 1)
//                return true;
//        }
//        return false;
//    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i : nums) {
            if (uniques.contains(i))
                return true;
            uniques.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        Contains_Duplicate_217 solution = new Contains_Duplicate_217();

        // Test cases
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Contains duplicate in nums1? " + solution.containsDuplicate(nums1)); // Should print true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Contains duplicate in nums2? " + solution.containsDuplicate(nums2)); // Should print false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Contains duplicate in nums3? " + solution.containsDuplicate(nums3)); // Should print true
    }
}
