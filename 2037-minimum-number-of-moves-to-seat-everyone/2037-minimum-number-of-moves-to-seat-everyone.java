import java.util.*;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        // 학생이 자리에 앉을 때 움직이는 횟수
        int answer = 0;
        
        Arrays.sort(seats);
        Arrays.sort(students);
        
        for(int i=0; i<seats.length; i++) {
            answer += Math.abs(seats[i]-students[i]);
        }
        
        return answer;
    }
}