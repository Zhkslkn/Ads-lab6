public class BreadthFirstSearch<V> implements Search<V> {
    private WeightedGraph<V> graph; // The graph to perform the search on

    /**
     * Constructs a new breadth-first search algorithm with the given graph.
     *
     * @param graph the graph to perform the search on
     */
    public BreadthFirstSearch(WeightedGraph<V> graph) {
        this.graph = graph;
    }

    @Override
    public void search(Vertex<V> start) {
        graph.BFS(start); // Perform breadth-first search on the graph starting from the given vertex
    }
}