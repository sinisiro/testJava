package Kruskal;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 최소신장트리를 찾기위한 알고리즘
 */
public class kruscalPath {

    HashMap<String, String> parent = new HashMap<>();
    HashMap<String, Integer> rank = new HashMap<>();



    public void makeSet(String node){
        parent.put(node, node);
        rank.put(node,0);

    }

    //root를 찾고, compression해준다.
    public String find(String node){
        //path compression 적용
        if(parent.get(node)!= node){
            parent.put(node, find(parent.get(node)));
        }

        return parent.get(node);
    }

    public void union(String nodeV, String nodeU){
        String root1 = find(nodeV);
        String root2 = find(nodeU);

        //Union by rank
        if(rank.get(root1) >rank.get(root2)){
            parent.put(root2, root1);       //D와 G를 연결해준다.
        }else{
            parent.put(root1, root2);
            if(rank.get(root1) == rank.get(root2)){
                rank.put(root2, rank.get(root2)+1);
            }

        }

    }

    public ArrayList<kEdge> kruscalFunc (ArrayList<String>vetices, ArrayList<kEdge> edges) {
        ArrayList<kEdge> mst = new ArrayList<kEdge>();
        kEdge currentEdge;


        //1. 초기화
        for (int index = 0; index < vetices.size(); index++) {
            makeSet(vetices.get(index));
        }

        //2.간선 weight 기반 sorting
        Collections.sort(edges);

        for (int index = 0; index < edges.size(); index++) {
            currentEdge = edges.get(index);
            if (find(currentEdge.nodeV) != find(currentEdge.nodeU)) {
                union(currentEdge.nodeV, currentEdge.nodeU);
                mst.add(currentEdge);
            }
        }

        return mst;
    }

}
