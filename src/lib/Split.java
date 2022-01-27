package lib;

import java.util.ArrayList;

public class Split {

    public void splitFunc(ArrayList<Integer> dataList){
        if(dataList.size()<=1){
            return;
        }

        int medium = dataList.size()/2;

        ArrayList<Integer>  leftArr = new ArrayList<>();
        ArrayList<Integer>  rightArr= new ArrayList<>();

        leftArr = new ArrayList<Integer>(dataList.subList(0,medium));
        rightArr = new ArrayList<Integer>(dataList.subList(medium, dataList.size()));

        System.out.println(leftArr);
        System.out.println(rightArr);
    }
}
