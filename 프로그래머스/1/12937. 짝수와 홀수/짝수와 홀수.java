import java.lang.StringBuilder;

class Solution {
    public String solution(int num) {
        
        StringBuilder answer = new StringBuilder();
        if (num % 2 == 0) {
            answer.append("Even");
        } else {
            answer.append("Odd");
        }
        return answer.toString();
    }
}