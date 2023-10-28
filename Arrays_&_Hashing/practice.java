import java.util.HashSet;

public class practice {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniques = new HashSet<>();
        for(int i : nums) {
            if (uniques.contains(i))
                return true;
            uniques.add(i);
        }
        return false;
    }
}
