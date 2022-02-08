package DijkstraPath;

public class Edge implements Comparable<Edge>{
    public int distance;
    public String vertex;

    public Edge(int distance, String vertex){
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public String toString() {
        return "Edge.{" +
                "distance=" + distance +
                ", vertex='" + vertex + '\'' +
                '}';
    }

    @Override
    public int compareTo(Edge edge){
        return this.distance - edge.distance;
    }
}

