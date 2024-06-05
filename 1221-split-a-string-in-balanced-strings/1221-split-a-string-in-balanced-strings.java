import java.util.*;

class Solution {
    public int balancedStringSplit(String s) {
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        
        for(int i=1; i<s.length(); i++) {
            char c = s.charAt(i);
            
            // 스택이 비어 있는 경우 넣고 다음 반복문 진행
            if(stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            
            char inChar = stack.peek();
                if(c != inChar) {
                    stack.pop();
                    if(stack.isEmpty()) answer++;   // 스택이 비어 있으면 짝이 맞음
                }
                else stack.push(c);
        }
            
        return answer;
    }
}