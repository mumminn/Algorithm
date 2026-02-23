import java.util.*;

class Solution {
    
    HashSet<Integer> set = new HashSet<>();
    boolean[] visited;
    
    public int solution(String numbers) {
        int answer = 0;
        visited = new boolean[numbers.length()];
        
        dfs("", numbers);
        
        for (int num : set){
            if(isPrime(num)){
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(String current, String others){
        if(!current.equals("")) set.add(Integer.parseInt(current));
        
        for(int i=0; i<others.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(current + others.charAt(i), others);
                visited[i] = false;
            }
        }
    }
    
    public boolean isPrime(int n){
        if(n < 2) return false;
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        
        return true;
    }
}