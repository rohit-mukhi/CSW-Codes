import java.util.LinkedList;
import java.util.Stack;

public class DFS {  
    int v;
    LinkedList<Integer> adj[];
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    DFS(int n) {
        v = n;
        adj = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
    }

     void dfs_algo(int s) {
        boolean visited[] = new boolean[v];
        Stack <Integer> q = new Stack <> ();
        visited[s] = true;
        q.add(s);
        while(!q.isEmpty()) {
            s = q.pop();
            System.out.print(s + " ");
            for(int i=0; i<adj[s].size(); i++) {
                int n = adj[s].get(i);
                if(!visited[n]) {
                    visited[n] = true;
                    q.push(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        // Initiating the graph and declaring the number of nodes
        DFS g = new DFS(7);
        //Adding of edges start here
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        g.addEdge(3, 4);
        g.addEdge(5, 6);

        System.out.println("DFS is : ");
        // This method is used to run the dfs algorithm
        g.dfs_algo(0); 
    }
}
