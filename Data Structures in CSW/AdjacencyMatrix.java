public class AdjacencyMatrix {
    static private int[][] adjMat;
    static private int numVertices;
    public static  void AdjacencyMatrix(int vertices) {
        numVertices = vertices;
        adjMat = new int[vertices][vertices];
    }

    public static void addEdge(int i, int j) {
        adjMat[i][j] = 1;
        adjMat[j][i] = 1;
    }

    public static void removeEdge(int i, int j) {
        adjMat[i][j] = 0;
        adjMat[j][i] = 0;
    }

    public static void printMatrix() {
        for(int i=0; i<adjMat.length; i++) {
            for(int j=0; j<adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        AdjacencyMatrix(4);
        addEdge(0, 3);
        addEdge(2, 1);
        addEdge(3, 2);
        addEdge(3, 1);
        addEdge(2, 0);
        printMatrix();
    }
}
