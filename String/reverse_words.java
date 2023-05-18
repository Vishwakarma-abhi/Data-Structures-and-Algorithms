import java.util.*;

/**
 * reverse_words
 */
public class reverse_words {

    public static void main(String[] args) {
        String s = "  the   sky   is   blue ";
        System.out.println("Given sentence ");
        System.out.println(s);
        // here regex for spaces --> " +"
        String[] words = s.trim().split(" +");
        // here we convert words array into array and then reverse it
        Collections.reverse(Arrays.asList(words));
        // here the join function join the words elements using space as delimeter
        System.out.println("Words are reversed in the sentence");
        System.out.println(String.join(" ", words));

    }
}