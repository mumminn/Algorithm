import java.io.*;
import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(0) == ')'){
                return(false);
            }
            
            if (s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }  
            if (s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return(false);
                }
                stack.pop();
            }
        }
        
        if(stack.isEmpty()){
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}