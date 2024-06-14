import java.util.*;

class Solution {
    static List<Integer>[] graph;
    static boolean[] check;
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // 시작점에서 종점까지 갈 수 있는지 확인
        graph = new ArrayList[n];
        check = new boolean[n];
        
         for (int i=0; i<n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // 인접 리스트로 그래프 구성
        for (int i=0; i<edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(v);
            graph[v].add(u);
        }
        
        return dfs(source, destination);
    }
    
    public static boolean dfs(int source, int destination) {
        if(source == destination) return true;
        
        check[source] = true;
        
        // 방문하지 않은 정점에 대해 dfs
        // dfs를 통해 destination에 도달할 수 있으면 true
        for(int v: graph[source]) {
            if(!check[v]) {
                if (dfs(v, destination)) return true;
            }
        }
        
        return false;
    }
}