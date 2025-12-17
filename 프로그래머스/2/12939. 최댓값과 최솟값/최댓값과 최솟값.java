import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s) {
                
        String[] strArray = s.split(" ");
        
        int[] a = new int[strArray.length];
        
        for (int i = 0; i < strArray.length; i++){
            a[i] = Integer.parseInt(strArray[i]);
        }
        
        Arrays.sort(a);
        
        String answer = a[0]+" "+a[a.length-1];
        return answer;
    }
    

}
