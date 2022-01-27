package lib;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    /**
     * for (int index = 0; index < dataList.size() - 1; index++) 반복
     * swap = false (교환이 되었는지를 확인하는 변수를 두자)
     * 반복문안의 반복문으로 n - 1번 반복하며,
     * 반복문안의 반복문 안에서, if (dataList.get(index2) > dataList.get(index2 + 1)) 이면
     * 데이터를 스왑하고, Collections.swap(dataList, index2, index2 + 1);
     * 스왑했음을 체크하기 위해, swap 을 true 로 놓고,
     * 반복문안의 반복문을 수행 후에도 swap 이 false 이면, 전체 반복을 멈춤 (break)
     * @param dataList
     * @return
     */
    public ArrayList<Integer> sort(ArrayList<Integer> dataList){

        for(int index = 0; index<dataList.size()-1; index++){
            boolean swap = false;

            for(int index2 = 0; index2 < dataList.size() -1 -index; index2++){
                if(dataList.get(index2) > dataList.get(index2+1)){
                    Collections.swap(dataList, index2, index2+1);
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
        return dataList;
    }

    public void bubbleTest(){
        ArrayList<Integer> testData = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            testData.add((int)(Math.random() * 100));
        }
        BubbleSort bSort = new BubbleSort();
        bSort.sort(testData);
        System.out.println(testData);
    }
}
