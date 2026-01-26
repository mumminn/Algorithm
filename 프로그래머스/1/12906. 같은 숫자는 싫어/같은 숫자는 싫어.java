import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i=0; i<arr.length; i++){
            if(i == 0){
                stack.push(arr[i]);
            } else {
                int lastNum = stack.peek();
                if(lastNum != arr[i]){
                    stack.push(arr[i]);
                }
            }
        }
        
        int size = stack.size();
        int[] answer = new int[stack.size()];
        
        for (int i = size-1; i >= 0; i--){
            answer[i] = stack.pop();
        }

        return answer;
    }
}