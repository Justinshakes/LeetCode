import java.util.*;

public class practice_Stacks {


    public static boolean isValidHashMap(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');


        for(char c : s.toCharArray()) {

            if (brackets.containsKey(c)) {
                if (!stack.isEmpty() && brackets.get(c).equals(stack.peek()))
                    stack.pop();
                else
                    return false;
            } else
                stack.push(c);
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {


    }
}