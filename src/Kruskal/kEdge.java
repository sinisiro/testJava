package Kruskal;


public class kEdge implements Comparable<kEdge>{
    public int weight;
    public String nodeV;
    public String nodeU;

    public kEdge(int weight, String nodeV, String nodeU){
        this.weight = weight;
        this.nodeV = nodeV;
        this.nodeU = nodeU;
    }

    @Override
    public String toString() {
        return "kEdge{" +
                "weight=" + weight +
                ", nodeV='" + nodeV + '\'' +
                ", nodeU='" + nodeU + '\'' +
                '}';
    }

    @Override
    public int compareTo(kEdge edge){
        return this.weight - edge.weight;
    }
}


