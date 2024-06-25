import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        // constraint: "C", "D", "+" 예외 발생 X
        for(int i=0; i<operations.length; i++) {
            String index = operations[i];
            if(index.equals("+")) {
                int pop1 = stack.pop();
                int pop2 = stack.pop();
                int sum = pop1 + pop2;
                stack.push(pop2);
                stack.push(pop1);
                stack.push(sum);
            }
            else if(index.equals("D")) {
                stack.push(stack.peek()*2);
            }
            else if(index.equals("C")) {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(index));
            }
        }
        
        while(!stack.isEmpty()) answer += stack.pop();
        
        return answer;
    }
}