import java.util.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        // 숫자: 개수
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for(Map.Entry entry: map.entrySet()) {
            int n = (int) entry.getValue();
            answer += n*(n-1)/2;
        }
        
        return answer;
    }
}