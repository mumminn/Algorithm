import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map <String, Integer> hashMap = new HashMap<>();
        
        for (int i=0; i<clothes.length; i++){
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for (String key : hashMap.keySet()){
            int num = hashMap.get(key) + 1;
            answer *= num;
        }
        
        return answer-1;
    }
}