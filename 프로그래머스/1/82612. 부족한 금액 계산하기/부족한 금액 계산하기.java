class Solution {
    public long solution(int price, int money, int count) {
        
        long num = 0;
        
        for(int i = 1 ; i <= count ; i++) {
            num += (long) price * i;
        }
        
        long answer = (money - num) * -1;
        
        if(answer <=  0 ) { answer = 0; }

        return answer;
    }
}