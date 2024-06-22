import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // 남아 있는 학생 return
        
        Queue<Integer> student = new LinkedList<>();
        for(int i: students) student.offer(i);
        
        int i = 0;
        int noEat = 0;
        
        while (!student.isEmpty() && noEat < student.size()) {
            if (student.peek() == sandwiches[i]) {
                student.poll();
                i++;
                noEat = 0; // 학생이 샌드위치를 먹으면 다시 초기화
            }
            else {  // 샌드위치를 못 먹으면 뒤로 가기
                student.offer(student.poll());
                noEat++;
            }
        }
        
        return student.size();
    }
}