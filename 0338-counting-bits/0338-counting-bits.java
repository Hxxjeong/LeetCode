class Solution {
    public int[] countBits(int n) {
        // 2진수로 바꿨을 때 1의 개수
        int[] answer = new int[n+1];
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<answer.length; i++) {
            int count = 0;
            sb.append(Integer.toBinaryString(i));
                      
            for(int j=0; j<sb.length(); j++) {
                if(sb.charAt(j) == '1') count++;
            }
            answer[i] = count;
            sb.setLength(0);
        }
        
        return answer;
    }
}