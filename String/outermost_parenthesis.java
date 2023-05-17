import java.util.*;

public class outermost_parenthesis {
    public static void main(String[] args) {
        String str = "(()())(())";

        // Stack for tracking theBrackets
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        // ===> (()())(())
        for (int i = 0; i < str.length(); i++) {
            // ( 
            if (str.charAt(i) == '(') {
                if (stk.size() > 0) {
                    sb.append(str.charAt(i));

                }
                stk.push(str.charAt(i));
            } else {
                stk.pop();

                if (stk.size() > 0) {
                    sb.append(str.charAt(i));

                }

            }
        }
        System.out.println(sb.toString());

    }

}
