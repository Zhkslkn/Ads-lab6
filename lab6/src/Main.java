public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> vertexA = new Vertex<>("A");
        Vertex<String> vertexB = new Vertex<>("B");
        Vertex<String> vertexC = new Vertex<>("C");
        Vertex<String> vertexD = new Vertex<>("D");
        Vertex<String> vertexE = new Vertex<>("E");

        graph.addVertex(vertexA);
        graph.addVertex(vertexB);
        graph.addVertex(vertexC);
        graph.addVertex(vertexD);
        graph.addVertex(vertexE);

        graph.addEdge(vertexA, vertexB, 1.0);
        graph.addEdge(vertexA, vertexC, 2.0);
        graph.addEdge(vertexB, vertexD, 3.0);
        graph.addEdge(vertexC, vertexD, 1.5);
        graph.addEdge(vertexC, vertexE, 2.5);
        graph.addEdge(vertexD, vertexE, 1.0);

        graph.printGraph();

        Search<String> bfs = new BreadthFirstSearch<>(graph);
        System.out.println("BFS: ");
        bfs.search(vertexA);
    }
}