import java.util.Map;
public class DijkstraSearch<V> implements Search<V> {
    private WeightedGraph<V> graph; // The graph to perform the search on

    /**
     * Constructs a new Dijkstra's algorithm search with the given graph.
     *
     * @param graph the graph to perform the search on
     */
    public DijkstraSearch(WeightedGraph<V> graph) {
        this.graph = graph;
    }

    @Override
    public void search(Vertex<V> start) {
        Map<Vertex<V>, Double> distances = graph.Dijkstra(start); // Perform Dijkstra's algorithm on the graph starting from the given vertex

        for (Map.Entry<Vertex<V>, Double> entry : distances.entrySet()) {
            Vertex<V> vertex = entry.getKey(); // Get the vertex
            double distance = entry.getValue(); // Get the distance
            System.out.println("Vertex " + vertex.getData() + ": " + distance);
        }
    }
}