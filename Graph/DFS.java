// Depth First Search Traversal in graph

import java.lang.Thread.State;
import java.util.*;

import javax.print.attribute.IntegerSyntax;

public class DFS extends BFS_graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes");
        int nodes = sc.nextInt();

        System.out.println("Enter the number of Edges ");
        int edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= nodes; i++) {
            adj.add(new ArrayList<>());
        }

        // Now addding the elements or construct the Graph
        System.out.println("Let 's construct graph");
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter Source --> destination nodes");
            int source = sc.nextInt();
            int dest = sc.nextInt();
            addEdges(source, dest, adj);

        }

        // DFS traversal
        ArrayList<Integer> dfs = new ArrayList<>();
        int visit[] = new int[nodes + 1];
        System.out.println("Enter the starting node for DFS traversal");
        int start = sc.nextInt();
        depth_traversal(adj, start, dfs, visit);
        display(dfs);
        sc.close();
    }

    public static void depth_traversal(ArrayList<ArrayList<Integer>> adj, int start, ArrayList<Integer> dfs,
            int[] visit) {
        // we get the starting node -> add it to dfs and mark it visiting

        visit[start] = 1;
        dfs.add(start);

        for (int i : adj.get(start)) {

            if (visit[i] == 0) {

                depth_traversal(adj, i, dfs, visit);

            }

        }

    }

    // display graph
    public static void display(ArrayList<Integer> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(graph.get(i) + " ");
        }
    }

    // constructing the graph or adding the edges to nodes
    public static void addEdges(int source, int dest,
            ArrayList<ArrayList<Integer>> adj) {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }

}
