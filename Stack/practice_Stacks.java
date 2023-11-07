import java.util.*;

public class practice_Stacks {


    public static boolean isValidHashMap(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();

        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char c : s.toCharArray()) {
            if (bracketMap.containsKey(c)) {
                if (!brackets.isEmpty() && bracketMap.get(c) == brackets.peek()) {
                    brackets.pop();
                } else return false;
            } else brackets.push(c);

        }
        return brackets.isEmpty();
    }


    public static void main(String[] args) {


    }
}