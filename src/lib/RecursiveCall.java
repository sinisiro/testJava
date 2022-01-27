package lib;

public class RecursiveCall {

    public int factorialFunc(int data){
        if(data <=1){
            return data;
        }
        return this.factorialFunc(data -1 ) + this.factorialFunc(data -2);
    }
}
