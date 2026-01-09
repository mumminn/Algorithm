import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hashMap = new HashMap<>();
        
        
        for(String participantItem : participant) {
            hashMap.put(participantItem, hashMap.getOrDefault(participantItem, 0) + 1);
        }
        
        for (String completionItem : completion) {
            hashMap.put(completionItem, hashMap.get(completionItem) - 1);
        }
        
        for (String key : hashMap.keySet()) {
            if(hashMap.get(key) != 0){
                answer = key;
                break;
            }
        }
        
        return answer;
    }
}