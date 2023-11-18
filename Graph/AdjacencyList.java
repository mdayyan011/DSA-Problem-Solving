package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes");

        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // u, v
        System.out.println("Enter no of edges");
        int e = sc.nextInt();
        for (int i = 0; i < e; i++) {
            System.out.println("Enter u and v");
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
        }
        
        // Print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
