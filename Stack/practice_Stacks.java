import java.util.*;

public class practice_Stacks {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (stack.isEmpty() && (c == ')' || c == '}' || c == ']')) return false;
            else {
                if (c == ')' && stack.peek() == '(') stack.pop();
                else if (c == '}' && stack.peek() == '{') stack.pop();
                else if (c == ']' && stack.peek() == '[') stack.pop();
                else stack.add(c);
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
                if (!brackets.isEmpty() && bracketMap.get(c) == brackets.peek()) brackets.pop();
                else return false;
            } else brackets.push(c);
        }
        return brackets.isEmpty();
    }

    public static void main(String[] args) {

    }
}
