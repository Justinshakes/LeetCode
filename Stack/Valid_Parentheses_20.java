import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses_20 {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) return false;
            else {
                if (s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                else if (s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
                else if (s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                else stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValidHashMap(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();

        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char c : s.toCharArray()) {
            if (bracketMap.containsKey(c)) {
                if (!brackets.isEmpty() && bracketMap.get(c).equals(brackets.peek())) brackets.pop();
                else return false;
            } else brackets.push(c);

        }
        return brackets.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        System.out.println("Is s1 valid: " + isValid(s1)); // true
        System.out.println("Is s2 valid: " + isValid(s2)); // true
        System.out.println("Is s3 valid: " + isValid(s3)); // false
        System.out.println("Is s4 valid: " + isValid(s4)); // false
        System.out.println("Is s5 valid: " + isValid(s5)); // true
    }

}
