public interface Search<V> {
    /**
     * Performs a search starting from the given vertex.
     *
     * @param start the start vertex
     */
    void search(Vertex<V> start);
}