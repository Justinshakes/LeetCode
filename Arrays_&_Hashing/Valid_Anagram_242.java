import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Last Practiced: November 5th 2023

public class Valid_Anagram_242 {

//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length())
//            return false;
//
//        Map<Character, Integer> charCount = new HashMap<>();
//
//        for (char c : s.toCharArray())
//            charCount.merge(c, 1, Integer::sum);
//
//        for (char c : t.toCharArray())
//            charCount.merge(c, -1, Integer::sum);
//
//        for (int count : charCount.values()) {
//            if (count != 0)
//                return false;
//        }
//
//        return true;
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
