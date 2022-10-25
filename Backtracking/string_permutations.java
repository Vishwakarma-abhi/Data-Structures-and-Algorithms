import java.util.*;

public class string_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str = sc.next();
        List<String> permutations = new ArrayList<>();
        generate_permutations(str, "", permutations);
        System.out.println("Generated Permutations of " + str);
        System.out.println(permutations);

    }

    public static void generate_permutations(String str, String bucket, List<String> permutations) {
        // base case
        if (str.length() == 0) {
            permutations.add(bucket);
            return;
        }
        // giving choosing to every index
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            // removing the choosed character from the input string
            String newString = str.substring(0, i) + str.substring(i + 1);
            // adding the choosed character in the bucket - string
            generate_permutations(newString, bucket + curr, permutations);
        }
    }

}
