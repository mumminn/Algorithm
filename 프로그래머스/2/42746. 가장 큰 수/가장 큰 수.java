import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        
        String[] numStr = new String[numbers.length];
        for (int i=0; i<numbers.length; i++){
            numStr[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(numStr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (numStr[0].equals("0")){
            return "0";
        }
        
        for (String str : numStr){
            answer.append(str);
        }
        
        return answer.toString();
    }
}