class Solution {
    public int[] shuffle(int[] nums, int n) {
        // 배열의 절반을 기준으로 다시 배열
        int[] answer = new int[nums.length];
        
        int x = 0;
        int y = n;
        int i = 0;
        
        while(x < n) {
            answer[i] = nums[x];
            answer[i+1] = nums[y];
            
            x++;
            y++;
            i += 2;
        }
        
        return answer;
    }
}