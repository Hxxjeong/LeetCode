import java.util.*;

class Solution {
    public int[] finalPrices(int[] prices) {
        // 다음 인덱스를 확인하여 같거나 작으면 할인 가능
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length-1; i++) {
            for(int j=i+1; j<prices.length; j++) {
                if(prices[j] <= prices[i]) {
                    answer[i] = prices[i] - prices[j];
                    break;
                }
                else {
                    answer[i] = prices[i];
                }
            }
        }
        
        answer[prices.length-1] = prices[prices.length-1];
        
        return answer;
    }
}