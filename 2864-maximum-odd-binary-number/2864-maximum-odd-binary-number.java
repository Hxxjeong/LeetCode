import java.util.*;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        // 가장 큰 홀수
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        
        for(int i=c.length-2; i>=0; i--) {
            sb.append(c[i]);
        }
        
        // 1의 자리가 1이면 홀수
        sb.append(c[c.length-1]);
        
        
        return sb.toString();
    }
}