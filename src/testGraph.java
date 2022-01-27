import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class testGraph {

    public void execute(){

        // 기본 선언 HashMap<키타입, 값타입> 변수 = new HashMap<키타입, 값타입>();
        HashMap<String, Integer> mapData1 = new HashMap<String, Integer>();
        HashMap<String, Integer> mapData2 = new HashMap<String, Integer>(mapData1);
        HashMap<String, Integer> mapData3 = new HashMap<String, Integer>(10);
        HashMap<String, ArrayList<String>> mapData4 = new HashMap<String, ArrayList<String>>();

        // HashMap 데이터 추가
        mapData1.put("A", 1);
        mapData1.put("B", 2);

        // HashMap 데이터 읽기
//        System.out.println(mapData1);
//        System.out.println(mapData1.get("A"));

        // HashMap 데이터 수정
        mapData1.put("B", 3);
//        System.out.println(mapData1);

        // HashMap 데이터 삭제
        mapData1.remove("A");
//        System.out.println(mapData1);

        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();

        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "E", "F")));
        graph.put("E", new ArrayList<String>(Arrays.asList("D")));
        graph.put("F", new ArrayList<String>(Arrays.asList("D")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C")));
        graph.put("H", new ArrayList<String>(Arrays.asList("C")));
        graph.put("I", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("J", new ArrayList<String>(Arrays.asList("I")));

        System.out.println(graph);

    }
}
