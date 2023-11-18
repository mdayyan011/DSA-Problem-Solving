package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WeightedAdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes");

        int n = sc.nextInt();

        ArrayList<HashMap<Integer, Integer>> adj = new ArrayList<HashMap<Integer, Integer>>();
        for (int i = 0; i < n; i++) {
            adj.add(new HashMap<Integer, Integer>());
        }
        System.out.println("Enter no of edges");
        int e = sc.nextInt();

        // u,v and wt
        for (int i = 1; i <= e; i++) {
            System.out.println("Enter u v and wt");
            int u = sc.nextInt();
            int v = sc.nextInt();
            int wt = sc.nextInt();

            adj.get(u).put(v, wt);
        }

        // Print
        for (int i = 0; i < n; i++) {
            for (Integer j : adj.get(i).keySet()) {
                System.out.print("(" + j + "," + adj.get(i).get(j) + "),");
            }
            System.out.println();
        }
    }
}
