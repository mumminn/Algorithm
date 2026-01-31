import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> pd = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i=0; i<priorities.length; i++){
            queue.add(new int[]{priorities[i], i});
            pd.add(priorities[i]);
        }
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
                        
            if(current[0] >= pd.peek()){
                pd.poll();
                answer++;
                if(current[1] == location) break;
                
            } else{
                queue.offer(current);
            }
        }
        
        return answer;
    }
}