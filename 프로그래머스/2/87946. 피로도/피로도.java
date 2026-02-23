import java.util.*;

class Solution {
    boolean[] visited;
    int answer = 0;
    public int solution(int k, int[][] dungeons) {        
        visited = new boolean[dungeons.length];
        
        dfs(0, k, dungeons);
        
        return answer;
    }
    
    public void dfs(int count, int nowK, int [][] dungeons){
        
        answer = Math.max(count, answer);

        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && nowK >= dungeons[i][0]) {
                visited[i] = true;
                dfs(count+1, nowK - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
    }
}