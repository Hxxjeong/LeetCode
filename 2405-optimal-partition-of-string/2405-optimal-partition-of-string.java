import java.util.*;

class Solution {
    public int partitionString(String s) {
        int answer = 1;
        int[] alphabet = new int[26];
        char[] c = s.toCharArray();
        alphabet[c[0]-'a']++;
        
        for(int i=1; i<c.length; i++) {
            if(alphabet[c[i]-'a'] != 0) {
                Arrays.fill(alphabet, 0);   // 초기화
                answer++;
                alphabet[c[i]-'a']++;
            }
            else alphabet[c[i]-'a']++;
        }
        
        return answer;
    }
}