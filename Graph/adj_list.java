import java.util.*;

public class adj_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Nodes/Vertices");
        int n = sc.nextInt();// vertices
        System.out.println("Enter the Number of Edges");
        int m = sc.nextInt();// edges

        // adjacency list to store the the graph

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        // Initializing the arraylist with arraylist for connections/edges
        for (int i = 0; i <= n; i++) {

            adj.add(new ArrayList<>());
        }

        // Undirected Graph --> O(V+ E)time
        for (int i = 0; i < m; i++) {
            System.out.println("Enter source and destination path nodes   ");
            int source = sc.nextInt();
            int dest = sc.nextInt();
            addEdge(source, dest, adj);

        }

        for (int i = 1; i < adj.size(); i++) {
            System.out.println(i + " ");
            for (int j = 1; j < adj.get(i).size(); j++) {
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
