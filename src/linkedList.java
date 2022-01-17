import lib.DoubleLinkedList;
import lib.SingleLinkedList;

import java.util.ArrayList;
import java.util.Collections;


public class linkedList {

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
        System.out.println(dataList);

    }
}
