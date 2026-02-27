import java.util.*;

class Solution {
    
    int[] dx = new int[]{-1, 1, 0, 0};
    int[] dy = new int[]{0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] visited = new int[n][m];
                
        return bfs(n, m, maps, visited);
    }
    
    public int bfs(int n, int m, int[][] maps, int[][] visited){
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{0, 0});
        visited[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int x = curr[0];
            int y = curr[1];
            
            if(x == n-1 && y == m-1){
                return visited[x][y];
            }
            
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(maps[nx][ny] == 1 && visited[nx][ny] == 0){
                        visited[nx][ny] = visited[x][y] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
            
            
            
        }
        
        return -1;
        
    }
        
    
}