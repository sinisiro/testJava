package BackTracking;

import java.util.ArrayList;

//N*N 이 주어졌을 때 퀸이 서로 공격할수 없도록 배치하는 문제
public class NQueen {

    public boolean isAvailable(ArrayList<Integer> candidate, Integer currentCol){
        Integer currentRow = candidate.size();
//        System.out.println("currentRow:"+currentRow);

        for(int index=0; index < currentRow; index++){
            /*
            1. 열(y)좌표가 같으면 안됨
            2. 대각선에 있으면 안됨
             */
            if((candidate.get(index) == currentCol || Math.abs(candidate.get(index) - currentCol) == currentRow - index)){
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param N : 행열 개수
     * @param currentRow : 현재 수행하는 행
     * @param currentCadidate  : 후보
     */
    public void dfsFunc(Integer N, Integer currentRow, ArrayList<Integer> currentCadidate){

        System.out.println("**호출 [dfsFunc]:"+N+"[currentRow]:"+currentRow+"[currentCadidate]:"+currentCadidate);
        // 모든 행을 promising 했다면 종료.
        // 마지막 열까지 간거니까 정확한 해를 찾은것임
        if(currentRow == N){
            System.out.println(currentCadidate);
            return;
        }

        //같은행의 모든 열을 순회한다.
        for(int index= 0; index < N; index++){
            System.out.println("[currentRow]:"+currentRow+"[Index]:"+index);
            if(this.isAvailable(currentCadidate, index) == true){

                currentCadidate.add(index);
                System.out.println("Avaliable : [currentRow]:"+currentRow+"[Index]:"+index+"[cadidate]:"+index+"[currentCadidate]:"+currentCadidate);
                System.out.println("");
                this.dfsFunc(N,currentRow+1, currentCadidate);  //후보를 찾으면 다음 행 진행.
                System.out.println("[dsfunc(currentRow+1 종료) [remove candidate]: "+currentRow+"[Index]:"+index);
                currentCadidate.remove(currentCadidate.size() -1);  //pruning. 다음후보를 채택할수 없으면, 마지막 후보로 채택된것을 제거한다.
            }
        }
        System.out.println("**[currentRow 종료]:"+currentRow);
    }
}
