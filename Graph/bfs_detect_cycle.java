
import java.util.*;

public class bfs_detect_cycle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Cycle Detection Using BFS Traversal");

        System.out.println("Enter the Graph details ");
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

        // Detecting cycle
        if (isCycle(adj, nodes)) {
            System.out.println("Cycle Present in the Graph");
        } else
            System.out.println("No Cycle Present in the Graph");

    }

    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        // checking for cycle
        return isCycle(adj, V);

    }

    public static boolean check_Cycle(ArrayList<ArrayList<Integer>> adj, int vertex, int root, boolean visit[]) {

        // maintaining a queue which is storing pair of current vertex and its parents
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, -1));
        // mark the current vertex as visited
        visit[root] = true;

        // Now putting the adjacent elements in the queue and traversal through the
        // graph

        while (!q.isEmpty()) {
            // removing queue's element to traverse its adjacency elements
            // taking out cuurent node to travel its adjacent element
            Integer node = q.peek().First;
            // taking out the parent of the cuurent vertex
            Integer parent = q.peek().Second;

            // Now remove the element from the queue
            q.remove();
            // Now Traversing through each vertex (visiting) --> adjacent connected nodes
            for (int it : adj.get(node)) {
                if (visit[it] == false) {

                    // mark the adjacent nodes of root node as visited after traversal
                    visit[it] = true;
                    // Adding the adjacent node for future traversing
                    q.add(new Pair(it, node));

                }
                // checking if the parent of any vertex is not the adjacent of any other vertex
                // in the graph
                // if parent of current vertex is not adjacent of any other vertex then we say
                // no cycle present
                else if (parent != it) {
                    return true;

                }

            }
        }
        // If it is true then then there is a cycle and we return false because we found
        // a cycle

        // return false if cycle found
        return false;
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int V) {

        boolean visit[] = new boolean[V + 1];
        int parent[] = new int[V];

        boolean result = false;
        Arrays.fill(parent, -1);

        // loop for components of the graph
        for (int i = 0; i < V; i++) {

            if (visit[i] == false) {
                if (check_Cycle(adj, V, i, visit))
                    result = true;
            }

        }

        return result;
    }

    public static class Pair {
        int First;
        int Second;

        Pair(int First, int Second) {
            this.First = First;
            this.Second = Second;

        }

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
