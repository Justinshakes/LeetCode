import java.util.Arrays;

public class Valid_Anagram_242 {

//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            int count = map.getOrDefault(c, 0);
//            map.put(c, count + 1);
//        }
//
//        for (char c : t.toCharArray()) {
//            if (!map.containsKey(c)) {
//                return false; // If 't' contains a character not in 's', they can't be anagrams.
//            }
//
//            int count = map.get(c);
//            if (count == 1) {
//                map.remove(c);
//            } else {
//                map.put(c, count - 1);
//            }
//        }
//
//        return map.isEmpty(); // If the map is empty, all characters matched in 's' and 't'.
//    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Convert sorted character arrays back to strings and compare them.
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Is '" + s1 + "' an anagram of '" + t1 + "'? " + isAnagram(s1, t1)); // Should print true

        String s2 = "rat";
        String t2 = "car";
        System.out.println("Is '" + s2 + "' an anagram of '" + t2 + "'? " + isAnagram(s2, t2)); // Should print false

        String s3 = "listen";
        String t3 = "silent";
        System.out.println("Is '" + s3 + "' an anagram of '" + t3 + "'? " + isAnagram(s3, t3)); // Should print true
    }

}
