import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map <Integer, Integer> hashMap = new HashMap<>();
        
        for(int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        
        int n = nums.length/2;
        
        if(hashMap.size() < n){
            answer = hashMap.size();
        } else {
            answer = n;
        }
        
        return answer;
    }
}