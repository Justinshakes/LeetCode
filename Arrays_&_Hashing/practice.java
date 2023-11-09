import java.util.*;

public class practice {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }

    public static boolean containsDuplicateHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        for (int num : map.values()) {
            if (num >= 2)
                return true;
        }
        return false;
    }
}
