package lib;

import java.util.ArrayList;
import java.util.Collections;

//12-4
public class InsertionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> datalist){

        for(int index =0; index < datalist.size() -1 ; index++){
            for(int index2 = index+1; index2>0; index2--){
                if(datalist.get(index2) < datalist.get(index2 -1)){
                    Collections.swap(datalist, index2, index2 -1);
                }else{
                    break;
                }
            }
        }
        return  datalist;
    }
}
