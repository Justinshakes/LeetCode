import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses_20 {
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//
//
//        for(char c : s.toCharArray()) {
//
//        }
//    }

    public static boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();

        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (bracketMap.containsKey(c)) {
                if (!brackets.isEmpty() && bracketMap.get(c).equals(brackets.peek()))
                    brackets.pop();
                else
                    return false;
            } else
                brackets.push(c);

        }
        return brackets.isEmpty();
    }

    public static void main(String[] args) {

//        String s1 = "()";
//        String s2 = "()[]{}";
//        String s3 = "(]";
        String s4 = "([)]";
//        String s5 = "{[]}";

//        System.out.println("Is s1 valid: " + isValid(s1)); // true
//        System.out.println("Is s2 valid: " + isValid(s2)); // true
//        System.out.println("Is s3 valid: " + isValid(s3)); // false
        System.out.println("Is s4 valid: " + isValid(s4)); // false
//        System.out.println("Is s5 valid: " + isValid(s5)); // true
    }

}
