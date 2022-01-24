import lib.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

import static lib.Merge_Sort.merge_sort;

public class testMain {


    public void testHeap(){
        //Heap
        Heap heapTest = new Heap(15);

        heapTest.insert(10);
        heapTest.insert(8);
        heapTest.insert(5);
        heapTest.insert(4);
        heapTest.insert(20);


        System.out.println(heapTest.heapArray);
        heapTest.pop();
        System.out.println(heapTest.heapArray);


    }

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort();

        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int index = 0; index < 2; index++) {
            testData.add((int)(Math.random() * 2));
        }


//        ArrayList<Integer> resultData   = mergeSort.mergeSplitFunc(testData);
//        System.out.println(resultData);

        int [] test = new int[4];
        test[0]=4;
        test[1]=2;
        test[2]=3;
        test[3]=1;

        merge_sort(test);


        //배열 선언.
        Integer [] testArray = new Integer[10];
        testArray[0] =  1;


        //스택
        Stack stack  =  new Stack();
        stack.push("1");
//        System.out.println(stack.pop());


//        System.out.println(testData);



        //non-static method cannot be referenced from a static context
        //static 내에서 함수호출시 그 객체를만들어줘야함
        if(true) {
//            testMain test = new testMain();
//            test.testHeap();
        }
        else {
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
            MyDoubleLinkedList.insertToFront(4, 3);
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

//        System.out.println(mainObject.getData("David"));

            HashMap<Integer, String> map1 = new HashMap();
            map1.put(1, "사과");
            map1.put(2, "바나나");
            map1.put(3, "포도");


            HashMap<String, String> map2 = new HashMap();
            map2.put("DaveLee", "01033334444");
            map2.put("Dave", "01032221111");
            map2.put("David", "0104445555");

            //tree
            NodeMgmt myTree = new NodeMgmt();
            myTree.insertNode(2);
            myTree.insertNode(3);
            myTree.insertNode(4);
            myTree.insertNode(6);

            Node findNode = myTree.search(3);
            System.out.println(findNode.getValue());
        }
    }


}
