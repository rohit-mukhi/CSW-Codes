import java.util.*;

public class GraphList {
    int vertices;
    List <Integer> adjList[];

    @SuppressWarnings("unchecked")
    public GraphList(int v) {
        vertices = v;
        adjList = new ArrayList[v];
        for(int i=0; i<v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u);
    }

    void printGraph() {
        for(int i=0; i<vertices; i++) {
            System.out.print(i + " -> ");
            for(int node : adjList[i])
                System.out.print(node + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphList list = new GraphList(5);
        list.addEdge(0, 1);
        list.addEdge(0, 2);
        list.addEdge(2, 3);
        list.addEdge(1, 4);
        list.addEdge(3, 4);
        list.addEdge(1, 2);
        list.printGraph();
    }
}
