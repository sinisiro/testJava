package lib;


import java.util.ArrayList;

public class MergeSort {

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        System.out.println("[mergeFunc]"+leftList + ":" + rightList);
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        int leftPoint = 0;
        int rightPoint = 0;

        // CASE1: left/right 둘 다 있을 때
        while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
            if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            } else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }

        // CASE2: right 데이터가 없을 때
        while (leftList.size() > leftPoint) {
            mergedList.add(leftList.get(leftPoint));
            leftPoint += 1;
        }

        // CASE3: left 데이터가 없을 때
        while (rightList.size() > rightPoint) {
            mergedList.add(rightList.get(rightPoint));
            rightPoint += 1;
        }

        return mergedList;
    }

    public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList) {


        if (dataList.size() <= 1) {
            return dataList;
        }
        int medium = dataList.size() / 2;
        System.out.println("[mergeSplitFunc]"+dataList + "[medium]"+medium);


        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        leftArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(0, medium)));
        System.out.println("leftArr"+leftArr);
        rightArr = this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())));
        System.out.println("rightArr"+rightArr);

        return this.mergeFunc(leftArr, rightArr);
    }

}