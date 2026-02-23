import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int mul = brown + yellow;
        int add = (brown + 4) / 2;
        
        for(int i = 1; i <= mul; i++){
            int j = mul/i;
            if(i*j == mul){
                if(i+j == add){
                    answer[0] = j;
                    answer[1] = i;
                    
                    break;
                }
                
            }
        }
        
        return answer;
    }
}