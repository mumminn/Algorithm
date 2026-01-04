class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        boolean isFirst = true;
        
        for (String str : s.split("")){
            if (str.equals(" ")) {
                answer.append(" ");
                isFirst = true;
            } else {
                if (isFirst) {
                    answer.append(str.toUpperCase());
                    isFirst = false;
                } else {
                    answer.append(str.toLowerCase());
                }
            }
            
        }
        
        
        return answer.toString();
    }
}