class Solution {
    public int searchInsert(int[] nums, int target) {
        // 정렬된 배열에서 target의 인덱스 찾기
        // 찾지 못한다면 추가되어야 할 인덱스 위치 return
        
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end) {
            int mid = start + (end-start)/2;
            
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        
        return start;   // 찾지 못한 경우
    }
}