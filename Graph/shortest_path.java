
import java.util.*;

public class shortest_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BFS Traversal");

        System.out.println("Enter number of vertices");
        int nodes = sc.nextInt();

        System.out.println("Enter number of edges");
        int edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= nodes; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges; i++) {
            System.out.println("Enter source and destination ");
            int source = sc.nextInt();
            int dest = sc.nextInt();
            addEdges(source, dest, adj);
        }
        System.out.println("Enter starting node for BFS Traversing ");
        int root = sc.nextInt();

        // Breadth First Search
        System.out.println("\nGiven Graph Using BFS");
        System.out.println(BFS(adj, nodes, root));

    }

    public static ArrayList<Integer> BFS(ArrayList<ArrayList<Integer>> adj, int vertex, int root) {
        ArrayList<Integer> bfs = new ArrayList<>();

        boolean visit[] = new boolean[vertex + 1];
        int dist[] = new int[vertex];

        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;
        Queue<Integer> q = new LinkedList<>();

        // specifying from which node are we travering
        q.add(root);
        visit[root] = true;

        while (!q.isEmpty()) {
            // removing queue's element to traverse its adjacency elements
            Integer node = q.poll();
            // adding the root element to the bfs container
            bfs.add(node);

            // Now Traversing through each vertex (visiting) --> adjacent connected nodes
            for (int it : adj.get(node)) {
                if (visit[it] == false) {

                    // Here we calculate distance of node to all other vertex(Such as)
                    // node to ---> it(other or adjacent nodes)
                    dist[it] = dist[node] + 1;
                    // mark the adjacent nodes of root node as visited after traversal
                    visit[it] = true;
                    // Adding the adjacent node for future traversing
                    q.add(it);
                }
            }
        }
        System.out.println("\nDistance Array ");
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        return bfs;
    }

    public static void display(ArrayList<Integer> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(graph.get(i) + "  ");
        }
    }

    // Adding Edges to the inputed vertex (source <--> destination)
    public static void addEdges(int source, int dest, ArrayList<ArrayList<Integer>> adj) {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
}
