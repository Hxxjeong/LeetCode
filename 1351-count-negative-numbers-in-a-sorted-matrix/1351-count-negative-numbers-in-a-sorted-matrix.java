import java.util.*;

class Solution {
    public int countNegatives(int[][] grid) {
        // 음수의 개수
        int answer = 0;
        
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] < 0) answer++;
            }
        }
        return answer;
    }
}