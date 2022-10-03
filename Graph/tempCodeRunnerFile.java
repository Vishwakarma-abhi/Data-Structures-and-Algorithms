import java.util.*;

public class adj_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Nodes");
        int n = sc.nextInt();
        System.out.println("Enter the Number of Edges");
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Undirected Graph
        for (int i = 0; i <= n; i++) {
            System.out.println("Enter source and destination path nodes   ");
            int source = sc.nextInt();
            int dest = sc.nextInt();
            addEdge(source, dest, adj);
            System.out.println();
        }

        for (int i = 0; i < adj.size(); i++) {
            System.out.println(i + "  --> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.println(" -->  " + adj.get(i).get(j));
            }
        }
    }

    // Adding nodes or vertices
    public static void addEdge(int source, int dest, ArrayList<ArrayList<Integer>> adj) {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }

}
