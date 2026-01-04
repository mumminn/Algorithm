import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(true){
            if (n < 10){
                answer += n;
                break;
            }
            
            int num = 0;
            
            num = n % 10; // 자릿 수
            n = n / 10; // 다음 수
            
            answer += num;
            
        }

        return answer;
    }
}