import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n = sc.nextInt();

        System.out.println("Enter number of edges");
        int e = sc.nextInt();

        int Adj[][] = new int[n][n];
        for (int i = 1; i <= e; i++) {
            int u = 0, v = 0;
            u = sc.nextInt();
            v = sc.nextInt();
            Adj[u][v] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Adj[i][j] + "  ");
            }
            System.out.println();
        }
    }
}