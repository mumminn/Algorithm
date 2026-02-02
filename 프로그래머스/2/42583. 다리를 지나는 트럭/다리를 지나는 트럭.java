import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int bridgeWeight = 0;
        int index = 0;
        
        Queue<Integer> bridge = new LinkedList<>();
        
        for (int i=0; i<bridge_length; i++){
            bridge.offer(0);
        }
        
        while (index < truck_weights.length) {
            
            bridgeWeight -= bridge.poll();
            
            if(bridgeWeight + truck_weights[index] <= weight) {
                bridge.offer(truck_weights[index]);
                bridgeWeight += truck_weights[index];
                index++;
            } else {
                bridge.offer(0);
            }
            
            time++;

        }
        
        return time + bridge_length;
    }
}