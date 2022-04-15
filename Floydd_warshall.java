import java.util.Scanner;

//Time Complexity  --->  O(n^3)
public class Floydd_warshall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the nodes of the graph");
        int nodes = sc.nextInt();

        int matrix[][] = new int[nodes][nodes];
        
        //Constructing the graph
        System.out.println("Enter the adjacency matrix");
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Inputed A0 Adjacency Matrix");
        display(matrix, nodes);
        
        // flooyd(matrix, nodes);

        warshall_algo(matrix,nodes);

        System.out.println("\n  All Pair Shortest Path Using Warshall ' s Algorithm");

        display(matrix,nodes);

    }
    
    static void warshall_algo(int[][] matrix, int nodes)
    {
        for (int k = 0; k < nodes; k++) {
            for (int i = 0; i < nodes; i++) {
                for (int j = 0; j < nodes; j++) {

                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    
                }
            }
            
        }
        
    }

    static void display(int[][] matrix, int nodes)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] >= 999)
                {
                    System.out.print("INF");
                }
                else
                {
                    System.out.print(matrix[i][j]+" ");
                }
                            }
            System.out.println();
        }
    }

    static void flooyd(int[][] dist, int nodes)
    {
        
        for(int k = 0; k < dist.length; k++)
        {
            for (int i = 0; i < dist.length; i++) {
                for (int j = 0; j < dist.length; j++) {
                    if(i == j)
                    {
                        dist[i][j] = 0;
                    }
                    if( (dist[i][k] + dist[k][j]) < dist[i][j])
                    {
                        dist[i][j] =dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[i].length; j++) {
                System.out.print(dist[i][j]+"  ");
            }
            System.out.println();
        }

    }
    
}
