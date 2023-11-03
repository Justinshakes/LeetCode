import java.util.*;

public class practice {

//    public static boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> uniques = new HashSet<>();
//        for(int i : nums) {
//            if(uniques.contains(i))
//                return true;
//            uniques.add(i);
//        }
//        return false;
//    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.merge(num, 1, Integer::sum);

        for(int i : nums) {
            if(map.get(i) > 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Contains duplicate in nums1? " + containsDuplicate(nums1)); // Should print true
    }
}
