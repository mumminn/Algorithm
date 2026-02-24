import java.util.*;

class Solution {
    
    boolean[][] map;
    
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        map = new boolean[n+1][n+1];
        
        for (int[] wire : wires){
            map[wire[0]][wire[1]] = map[wire[1]][wire[0]] = true;
        }
        
        for(int[] wire : wires){
            int cutV1 = wire[0];
            int cutV2 = wire[1];
            
            map[cutV1][cutV2] = map[cutV2][cutV1] = false;
            
            int count = bfs(n, cutV1);
            int diff = Math.abs(count - (n - count));
            
            answer = Math.min(answer, diff);
            
            map[cutV1][cutV2] = map[cutV2][cutV1] = true;
        }
        
        return answer;
    }
    
    public int bfs(int n, int node){
        boolean[] visited = new boolean[n+1];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(node);
        visited[node] = true;
        
        int count = 1;
        
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            
            for(int i = 1; i <= n; i++){
                if(map[curr][i] && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                    count++;
                }
            }
            
        }
        
        return count;
        
    }
}