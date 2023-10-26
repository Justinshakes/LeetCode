import java.util.HashMap;
import java.util.HashSet;

public class practice {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c))
                return false;

            int count = map.get(c);
            if (count == 1)
                map.remove(c);
            else
                map.put(c, count - 1);
        }

        return map.isEmpty();
    }
}
