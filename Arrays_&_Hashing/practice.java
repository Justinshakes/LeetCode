import java.util.*;

public class practice {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }

        for (char c : t.toCharArray()) {
            map.merge(c, -1, Integer::sum);
        }

        for (int i : map.values()) {
            if (i != 0)
                return false;
        }

        return true;
    }
}
