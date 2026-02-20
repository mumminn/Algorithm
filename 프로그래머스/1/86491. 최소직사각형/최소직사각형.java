import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for (int[] size : sizes){
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            
            maxW = Math.max(maxW, max);
            maxH = Math.max(maxH, min);
        }
        
        return maxW * maxH;
    }
}