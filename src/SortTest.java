import Search.SequencialSearch;
import lib.BubbleSort;
import lib.MergeSort;
import lib.QuickSort;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

    public void bubbleTest(){

        ArrayList<Integer> testData = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            testData.add((int)(Math.random() * 100));
        }
        BubbleSort bSort = new BubbleSort();
        bSort.sort(testData);
        System.out.println(testData);
    }

    public void execute(){
        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int index = 0; index < 10; index++) {
            testData.add((int)(Math.random() * 10));
        }
        //병합정렬
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        System.out.println("test:"+testData);
        ArrayList<Integer> resultQuickData = quickSort.sort(testData);
        System.out.println("quick:"+resultQuickData);
        ArrayList<Integer> resultMergeData = mergeSort.mergeSplitFunc(testData);
        System.out.println("merge:"+resultMergeData);

        //20. 순차탐색
        SequencialSearch sequencialSearch = new SequencialSearch();
        int result = sequencialSearch.searchFunc(testData,99);
        System.out.println("Seq ressult:"+result);

    }


}
