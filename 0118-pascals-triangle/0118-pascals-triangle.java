import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        /*
            파스칼의 삼각형 공식
            1   
            1C0 1C1
            2C0 2C1 2C2
            3C0 3C1 3C2 3C3
            4C0 4C1 4C2 4C3 4C4
            ...
        */
        
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j=0; j<=i; j++) {
                if (j == 0 || j == i) { // 첫번째 & n번째
                    row.add(1);
                } else {
                    // 현재의 x번 인덱스 = 윗줄의 x-1번 인덱스 + x번 인덱스
                    row.add(answer.get(i-1).get(j-1) + answer.get(i-1).get(j));
                }
            }
            answer.add(row);
        }
        
        return answer;
    }
}