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


    public static void main(String[] args) {


    }
}