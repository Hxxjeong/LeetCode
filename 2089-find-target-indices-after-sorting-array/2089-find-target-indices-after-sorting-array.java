class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length-1;
        
        while(left <= right) {
            int mid = left + (right-left) / 2;
            if(target < nums[mid]) right = mid-1;
            else if (target > nums[mid]) left = mid+1;
            else {
                // target을 찾았을 때 앞뒤로 target과 동일한 숫자 탐색
                int i = mid;
                while (i >= 0 && nums[i] == target) {
                    list.add(i);
                    i--;
                }
                i = mid + 1;
                while (i < nums.length && nums[i] == target) {
                    list.add(i);
                    i++;
                }
                break;
            }
        }
        
        Collections.sort(list);
        
        return list;
    }
}