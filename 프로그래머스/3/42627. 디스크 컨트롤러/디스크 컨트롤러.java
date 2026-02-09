import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        int jobIdx = 0;
        int count = 0;
        
        int[][] jobList = new int[jobs.length][3];
        
        for (int i = 0; i < jobs.length; i++){
            jobList[i][0] = jobs[i][0];
            jobList[i][1] = jobs[i][1];
            jobList[i][2] = i;
        }
        
        Arrays.sort(jobList, (a, b) -> (a[0] - b[0]));
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[2], b[2]);
        });
        
        while (count < jobs.length){
            while(jobIdx < jobs.length && jobList[jobIdx][0] <= time){
                pq.add(jobList[jobIdx++]);
            }
            
            if (pq.isEmpty()){
                time = jobList[jobIdx][0];
            } else {
                int[] now = pq.poll();
                answer += (time - now[0]) + now[1];
                time += now[1];
                count++;
            }
        }
        
        
        return answer / jobs.length;
    }
}