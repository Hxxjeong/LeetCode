import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> list = new ArrayList<>();

        for(int[] m: mat) Arrays.sort(m);
        
        // 각 행의 1의 개수 세기
        for (int i=0; i<mat.length; i++) {
            int count = 0;
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count = mat[i].length - j;
                    break;
                }
            }
            list.add(new int[]{count, i});
        }

        // 1의 개수가 적은 순 정렬 (같으면 인덱스 기준으로 오름차순 정렬)
        Collections.sort(list, (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        
        int[] answer = new int[k];
        for (int i=0; i<k; i++) {
            answer[i] = list.get(i)[1];
        }

        return answer;
    }
}
