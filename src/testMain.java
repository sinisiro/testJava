import lib.DoubleLinkedList;
import lib.MyHash;
import lib.SingleLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class testMain {

    public static void main(String[] args) {
        // 싱글 링크드 리스트
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
//        MyLinkedList.addNode(1);
//        MyLinkedList.addNode(2);
//        MyLinkedList.addNode(3);
//        MyLinkedList.addNode(4);
//
//        MyLinkedList.addNodeInside(6, 3);
//        MyLinkedList.printAll();

        // 더블 링크드 리스트
        DoubleLinkedList<Integer> MyDoubleLinkedList = new DoubleLinkedList<Integer>();

        MyDoubleLinkedList.addNode(1);
        MyDoubleLinkedList.addNode(2);
        MyDoubleLinkedList.addNode(4);
        MyDoubleLinkedList.insertToFront(4,3);
//        System.out.println(MyDoubleLinkedList.getHead());
//        MyDoubleLinkedList.pritAll();

        // 버블소트
        ArrayList<Integer> dataList = new ArrayList<Integer>();
        dataList.add(9);
        dataList.add(2);
        dataList.add(4);

        for (int index = 0; index < dataList.size() - 1; index++) {
            if (dataList.get(index) > dataList.get(index + 1)) {
                Collections.swap(dataList, index, index + 1);
            }
        }
//        System.out.println(dataList);

        //Hash
        MyHash mainObject = new MyHash(20);
        mainObject.saveData("DaveLee", "01022223333");
        mainObject.saveData("fun-coding", "01033334444");
        mainObject.saveData("David", "01044445555");
        mainObject.saveData("Dave", "01055556666");

        System.out.println(mainObject.getData("David"));

        HashMap<Integer, String> map1 = new HashMap();
        map1.put(1, "사과");
        map1.put(2, "바나나");
        map1.put(3, "포도");

        HashMap<String, String> map2 = new HashMap();
        map2.put("DaveLee", "01033334444");
        map2.put("Dave", "01032221111");
        map2.put("David", "0104445555");

    }
}
