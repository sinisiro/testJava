import DijkstraPath.DijkstraPath;
import DijkstraPath.Edge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class testDijkstra {

    public void execute(){

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Edge(2,"A"));
        priorityQueue.add(new Edge(5,"B"));
        priorityQueue.add(new Edge(7,"C"));
        priorityQueue.add(new Edge(1,"D"));

//        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.size());

        HashMap<String, ArrayList<Edge>> graph = new HashMap<String, ArrayList<Edge>>();
        graph.put("A", new ArrayList<Edge>(Arrays.asList(new Edge(8, "B"), new Edge(1, "C"), new Edge(2, "D"))));
        graph.put("B", new ArrayList<Edge>());
        graph.put("C", new ArrayList<Edge>(Arrays.asList(new Edge(5, "B"), new Edge(2, "D"))));
        graph.put("D", new ArrayList<Edge>(Arrays.asList(new Edge(3, "E"), new Edge(5, "F"))));
        graph.put("E", new ArrayList<Edge>(Arrays.asList(new Edge(1, "F"))));
        graph.put("F", new ArrayList<Edge>(Arrays.asList(new Edge(5, "A"))));

        for (String key : graph.keySet()) {
//            System.out.println(key);
//            System.out.println(graph.get(key));
        }

        DijkstraPath dObject = new DijkstraPath();
        HashMap<String, Integer> result = dObject.dijkstraFunc(graph, "A");
        System.out.println(result);

    }
}
