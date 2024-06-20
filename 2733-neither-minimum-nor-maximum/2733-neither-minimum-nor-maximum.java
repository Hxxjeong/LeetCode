class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max = Arrays.stream(nums).max().orElse(0);
        int min = Arrays.stream(nums).min().orElse(0);
        
        for(int i: nums) {
            if(i != max && i != min) {
                return i;
            }
        }
        return -1;
    }
}