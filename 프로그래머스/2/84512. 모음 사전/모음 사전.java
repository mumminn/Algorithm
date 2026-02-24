import java.util.*;

class Solution {
    String[] dict = {"A", "E", "I", "O", "U"};
    List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        
        dfs("");
        
        return list.indexOf(word) + 1;
    }
    
    public void dfs(String str){
        if(str.length() == 5) return;
        
        for(int i=0; i<5; i++){
            String next = str + dict[i];
            list.add(next);
            dfs(next);
        }
    }
}