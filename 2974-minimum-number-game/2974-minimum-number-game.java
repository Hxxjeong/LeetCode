import java.util.*;

class Solution {
    public int[] numberGame(int[] nums) {
        // 배열에서 제일 작은 수 삭제
        // 나중에 삭제한 사람이 먼저 새 배열에 추가

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i+=2) {
            swap(nums, i, i+1);
        }

        return nums;
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}