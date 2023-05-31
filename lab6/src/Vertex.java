import java.util.HashMap;
import java.util.Map;
public class Vertex<V> {
    private V data; // The data associated with the vertex
    private Map<Vertex<V>, Double> adjacentVertices; // Map of adjacent vertices and their weights

    /**
     * Constructs a new vertex with the given data.
     *
     * @param data the data associated with the vertex
     */
    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>(); // Initialize the map of adjacent vertices
    }

    /**
     * Adds an adjacent vertex with the given destination and weight.
     *
     * @param destination the destination vertex
     * @param weight      the weight of the edge between the vertices
     */
    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight); // Add the adjacent vertex with the weight to the map
    }

    /**
     * Returns the data associated with the vertex.
     *
     * @return the data of the vertex
     */
    public V getData() {
        return data;
    }

    /**
     * Returns the map of adjacent vertices and their weights.
     *
     * @return the map of adjacent vertices and weights
     */
    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }
}