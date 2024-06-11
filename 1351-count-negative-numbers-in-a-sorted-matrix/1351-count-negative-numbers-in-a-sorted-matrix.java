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
        for (int i = 0; i < grid.length; i++) {
            int rowLength = grid[i].length;
            int low = 0, high = rowLength - 1;
            
            while (low <= high) {
                int mid = low + (high-low)/2;
                if (grid[i][mid] < 0) high = mid - 1;
                else low = mid + 1;
            }
            
            // low 이후 음수
            answer += rowLength - low;
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