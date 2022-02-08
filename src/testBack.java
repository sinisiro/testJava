import BackTracking.NQueen;

import java.util.ArrayList;

public class testBack {
    public void execute(){

        NQueen nObject = new NQueen();
        nObject.dfsFunc(4, 0, new ArrayList<Integer>());
    }
}
