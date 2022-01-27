package lib;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int lowest;
        for (int stand = 0; stand < dataList.size() - 1; stand++) {
            lowest = stand;
            for (int index = stand + 1; index < dataList.size(); index++) {
                if (dataList.get(lowest) > dataList.get(index)) {
                    lowest = index;
                }
            }
            Collections.swap(dataList, lowest, stand);
        }
        return dataList;
    }

    public ArrayList<Integer> sort2(ArrayList<Integer> dataList){
        int lowest;

        for(int stand =0; stand <  dataList.size() -1 ; stand ++){
            lowest = stand;

            for(int index = stand+1 ; index < dataList.size(); index ++) {
//                System.out.println(index);
                if (dataList.get(index) <= dataList.get(lowest)) {
                    lowest = index;
                }
            }
            Collections.swap(dataList, stand,lowest);
        }

        return  dataList;
    }

    public void test(ArrayList<Integer> dataList) {
        this.sort2(dataList);
        System.out.println(dataList);
    }
}
