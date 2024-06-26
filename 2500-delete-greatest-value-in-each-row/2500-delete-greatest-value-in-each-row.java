import java.util.*;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int answer = 0;
        
        // 각 행 정렬
        for(int[] row: grid)
            Arrays.sort(row);

        for(int i=grid[0].length-1; i>=0; i--) {
            int max = 1;

            for(int[] row: grid)
                max = Math.max(row[i], max);

            answer += max;
        }
        
        return answer;
    }
}