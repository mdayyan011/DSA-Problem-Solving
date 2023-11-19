import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList; 
import java.util.Queue;
import java.util.Scanner;

public class BFS{
    public static void main(String args[]) {
        // input-> number of nodes, edges list

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
        
        
        // BFS
        // src - 0
        HashMap<Integer, Boolean> visited = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited.put(0, true);
        while (!q.isEmpty()) {
            int fNode = q.poll();
            System.out.println(fNode+" ");
            for (int neighbour : adj.get(fNode)) {
                if (visited.getOrDefault(neighbour,false) == false) {
                    q.add(neighbour);
                    visited.put(neighbour, true);
                }
            }

        }


    }
}