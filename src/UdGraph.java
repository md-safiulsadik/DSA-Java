public class UdGraph {
    public static void main(String[] args) {
        // Adjacency Metrix = a 2D array to store 1's/0's to represent edges
        //                    # of row = # of unique nodes
        //                    # of columns = # of unique nodes

        //                    run-time complexity to check an edge = O(1)
        //                    space complexity = O(v^2)

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdges(0, 1);
        graph.addEdges(2, 4);
        graph.addEdges(1, 3);
        graph.addEdges(2, 3);
        graph.addEdges(4, 1);

        graph.print();

        System.out.println(graph.checkEdges(0, 1));
        System.out.println(graph.checkEdges(0, 4));

    }
}
