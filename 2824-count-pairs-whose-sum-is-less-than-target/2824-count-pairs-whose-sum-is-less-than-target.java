import java.util.*;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // target보다 작은 짝의 개수
        int answer = 0;
        
        Collections.sort(nums);
        
        for(int i=0; i<nums.size()-1; i++) {
            for(int j=i+1; j<nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target)
                    answer++;
                else break;
            }
        }
        
        return answer;
    }
}