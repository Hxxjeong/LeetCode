class Solution {
    public int findCenter(int[][] edges) {
        // 그래프의 센터 찾기
        
        // 간선은 2개 이상이기 때문에 첫번째 정점과 두번쨰 정점만 비교해도 무방
        int start1 = edges[0][0];
        int end1 = edges[0][1];
        
        int start2 = edges[1][0];
        int end2 = edges[1][1];
        
        return start1 == start2 || start1 == end2 ? start1 : end1;
    }
}