import java.util.*;

public class outermost_parenthesis {
    public static void main(String[] args) {
        String str = "(()())(())";

        System.out.println("Given String ");
        System.out.println(str);
        // Stack for tracking theBrackets
        Stack<Character> brackets = new Stack<>();
        // variable to store answer
        String ans = "";

        for (int i = 0; i < str.length(); i++) {

            // now we will check if it is open "(" bracket
            if (str.charAt(i) == '(') {
                // now we will check if the open bracket is outermost or not
                // if the size of the stack is > 0 it means It is having some element and the
                // current processing ith character is not outermost
                // so include it in the answer
                if (brackets.size() > 0) {
                    ans += str.charAt(i);
                }
                // also push it in the stack
                // and when it will encounter close it will be removed
                brackets.push(str.charAt(i));
            } else {
                // now if it is a close bracket
                // now we will first remove and then check condition
                // since it encounters its pair it is removed
                brackets.pop();
                // now we will check if after removing current stack brackets
                // whether it was outermost or not -> stk.size() == 0 if yes then it is
                // outermost
                // then we should not add it to answer
                if (brackets.size() > 0) {
                    // then the removed bracket was outermost so donot add it otherwise add it
                    ans += str.charAt(i);
                }

            }
        }

        System.out.println("After Removing Outermost Parenthesis  " + ans);

    }

}
