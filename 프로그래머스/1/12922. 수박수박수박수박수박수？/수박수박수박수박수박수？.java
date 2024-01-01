class Solution {
    public String solution(int n) {
        String answer = "";
        
        if(n%2 == 0) {
            int num = n/2;
            for(int i = 0 ; i < num ; i++) {
                answer +="수박";
            }
        } else {
             int num = (n-1)/2;
            for(int i = 0 ; i < num ; i++) {
                answer +="수박";
            }
            answer +="수";
        }
        
        return answer;
    }
}