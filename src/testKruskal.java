import DijkstraPath.Edge;
import Kruskal.kEdge;
import Kruskal.kruscalPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//22.02.03
public class testKruskal {


    public void execute(){

        ArrayList<String> vetices = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        ArrayList<kEdge> edges = new ArrayList<kEdge>();
        edges.add(new kEdge(7, "A", "B"));
        edges.add(new kEdge(5, "A", "D"));
        edges.add(new kEdge(7, "B", "A"));
        edges.add(new kEdge(8, "B", "C"));
        edges.add(new kEdge(9, "B", "D"));
        edges.add(new kEdge(7, "B", "E"));
        edges.add(new kEdge(8, "C", "B"));
        edges.add(new kEdge(5, "C", "E"));
        edges.add(new kEdge(5, "D", "A"));
        edges.add(new kEdge(9, "D", "B"));
        edges.add(new kEdge(7, "D", "E"));
        edges.add(new kEdge(6, "D", "F"));
        edges.add(new kEdge(7, "E", "B"));
        edges.add(new kEdge(5, "E", "C"));
        edges.add(new kEdge(7, "E", "D"));
        edges.add(new kEdge(8, "E", "F"));
        edges.add(new kEdge(9, "E", "G"));
        edges.add(new kEdge(6, "F", "D"));
        edges.add(new kEdge(8, "F", "E"));
        edges.add(new kEdge(11, "F", "G"));
        edges.add(new kEdge(9, "G", "E"));
        edges.add(new kEdge(11, "G", "F"));

//        System.out.println(vetices);
//        System.out.println(edges);

        kruscalPath kObject = new kruscalPath();
        ArrayList<kEdge> rslt = kObject.kruscalFunc(vetices,edges);

        System.out.println(rslt);

    }



}
