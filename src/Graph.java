import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes = new ArrayList<>();
    int[][] matrix;


    Graph(int size) {
        this.matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdges(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdges(int src, int dst) {
        if (matrix[src][dst] == 1) {
            return true;
        }
        else return false;
    }

    public void print() {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
