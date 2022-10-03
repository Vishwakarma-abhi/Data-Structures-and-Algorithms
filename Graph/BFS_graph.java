
import java.util.*;

public class BFS_graph {
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

		// Breadth First Search
		System.out.println("Given Graph Using BFS");
		System.out.println(BFS(adj, nodes));

	}

	public static ArrayList<Integer> BFS(ArrayList<ArrayList<Integer>> adj, int vertex) {
		ArrayList<Integer> bfs = new ArrayList<>();

		boolean visit[] = new boolean[vertex + 1];

		Queue<Integer> q = new LinkedList<>();

		q.add(1);
		visit[1] = true;

		while (!q.isEmpty()) {
			Integer node = q.poll();
			bfs.add(node);

			// Now Traversing through each vertex (visiting) --> adjacent connected nodes
			for (int it : adj.get(node)) {
				if (visit[it] == false) {
					visit[it] = true;
					// Adding the non - visited Adjancent node of 'i'
					q.add(it);
				}
			}
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
