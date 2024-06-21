import java.util.*;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        // 수를 정렬하여 2의 제곱일 때 true

        // 숫자 정렬
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        
        String s = new String(c);
        
         // 10의 9승으로 제한되어 있기 때문에 int형의 모든 2의 제곱수 확인 가능
        for (int i = 0; i < 31; i++) {
            int powOf2 = 1 << i;
            
            char[] c2 = String.valueOf(powOf2).toCharArray();
            Arrays.sort(c2);
            
            String s2 = new String(c2);
            if (s.equals(s2)) {
                return true;
            }
        }
        
        return false;
    }
}