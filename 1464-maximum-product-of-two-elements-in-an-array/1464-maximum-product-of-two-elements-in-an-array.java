import java.util.*;

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int maxSecond = nums[nums.length-2];
        
        return (max-1) * (maxSecond-1);
    }
}