import java.util.*;

class adj_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes");
        int n = sc.nextInt();
        System.out.println("Enter number of edges");
        int m = sc.nextInt();
        int adj[][] = new int[n + 1][n + 1];

        // undirected Graph --> O(v^2) both time and space
        System.out.println("Build the Graph");
        for (int i = 0; i < m; i++) {
            System.out.println("Enter source path and destination");
            int source = sc.nextInt();
            int dest = sc.nextInt();
            adj[source][dest] = 1;
            adj[dest][source] = 1;
        }
        System.out.println("Builded Graph Path ");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {

                System.err.print(adj[i][j] + "  ");
            }
            System.out.println();
        }

    }

}