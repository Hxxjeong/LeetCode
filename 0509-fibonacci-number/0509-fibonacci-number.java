class Solution {
    public int fib(int n) {
        // 피보나치 수열
        int[] fibo = new int[31];
        fibo[0] = 0;
        fibo[1] = 1;
        
        for(int i=2; i<31; i++) {
            fibo[i] = fibo[i-2] + fibo[i-1];
        }
        
        return fibo[n];
    }
}