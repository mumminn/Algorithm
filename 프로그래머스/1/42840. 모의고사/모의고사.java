import java.util.*;

class Solution {
    public int[] solution(int[] answers) {        
        int[] oneAns = {1, 2, 3, 4, 5};
        int[] twoAns = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] threeAns = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] correct = new int[3];
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == oneAns[i % oneAns.length]) correct[0]++;
            if(answers[i] == twoAns[i % twoAns.length]) correct[1]++;
            if(answers[i] == threeAns[i % threeAns.length]) correct[2]++;
        }
        
        int maxScore = Math.max(correct[0], Math.max(correct[1], correct[2]));
        
        List<Integer> list = new ArrayList<>();
        if(maxScore == correct[0]) list.add(1);
        if(maxScore == correct[1]) list.add(2);
        if(maxScore == correct[2]) list.add(3);
    
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}