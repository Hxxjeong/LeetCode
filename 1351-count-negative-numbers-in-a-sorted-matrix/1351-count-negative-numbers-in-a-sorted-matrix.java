import java.util.*;

class Solution {
    public int countNegatives(int[][] grid) {
        // 음수의 개수 return
        int answer = 0;
        
        // 배열 내림차순 정렬 (오름차순 정렬 후 left와 right를 바꾸는 형식)
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
            reverseArray(grid[i]);
        }
        
        // 내림차순 정렬되어 있으므로 음수를 만나면 이후 원소도 모두 음수
        for (int i=0; i<grid.length; i++) {
            int rowLength = grid[i].length; // 각 행의 길이
            int col = rowLength - 1;    // 제일 끝 원소
            
            while (col >= 0 && grid[i][col] < 0) col--;
            
            // col 이후는 모두 음수
            answer += rowLength - (col+1);
        }
        
        return answer;
    }
    
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        
        while(left < right) {
            int tmp = arr[right];
            arr[right] = arr[left];
            arr[left] = tmp;
            
            left++;
            right--;
        }
    }
}