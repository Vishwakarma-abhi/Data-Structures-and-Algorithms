import java.util.*;

public class revisit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputDist[] = { 29, 38, 12, 48, 39, 55 };
        int start = 30, end = 50;

        int j = 0, count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < inputDist.length; i++) {
            if (inputDist[i] > start && inputDist[i] < end) {

                list.add(inputDist[i]);
            }

        }
        int answer[] = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        System.out.println();
        for (int k = 0; k < list.size(); k++) {
            System.out.print(answer[k] + " ");
        }

        // Answer shoudld be 1 and

    }

}
