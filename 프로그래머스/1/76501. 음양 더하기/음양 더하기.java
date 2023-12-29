class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0 ; i < signs.length ; i++){
            if(signs[i] == false)
            {
                absolutes[i] = -absolutes[i]; // 단순하게 *-1 해줘서 음수 만드는 것
            }
        }
        
        for(int i = 0 ; i < absolutes.length ; i++) {
            answer += absolutes[i];
        }
        
        
        return answer;
    }
}