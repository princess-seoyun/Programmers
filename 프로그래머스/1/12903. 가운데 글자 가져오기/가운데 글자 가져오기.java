class Solution {
    public String solution(String s) {
        String answer = "";
        int num;
        
        String[] s2 = s.split("");
        
        if(s2.length % 2 == 0)
        {
            // 짝수일 경우임
            num = (s2.length / 2) -1;
            answer = s2[num] + s2[num+1];
        } else {
            // 홀수일 경우
            num = (s2.length / 2);
            answer = s2[num];
        }
        
        return answer;
    }
}