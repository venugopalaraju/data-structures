package graphs;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A","B");
        graph.addVertex("D");
        graph.addVertex("C");
        graph.addEdge("A","D");
        graph.addEdge("B","D");
        graph.addEdge("C","D");
        //graph.removeEdge("C","D");
        graph.removeVertex("D");
        graph.printGraph();
    }
}
