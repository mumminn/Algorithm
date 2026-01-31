import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i=0; i<progresses.length; i++){
            int remaining = 100 - progresses[i];
            int days = remaining / speeds[i];
            
            if ((remaining % speeds[i]) != 0){
                days++;
            }
            
            queue.offer(days);
        }
        
        while(!queue.isEmpty()){
            int currentMax = queue.poll();
            int count = 1;
            
            while (!queue.isEmpty() && queue.peek() <= currentMax){
                queue.poll();
                count++;
            }
            
            list.add(count);
        }
                
        return list.stream().mapToInt(i->i).toArray();
    }
}