class Solution {
    public long solution(long n) {
        
        long answer = 0;
        
        // 제곱근(루트) 구하는 sqrt()메소드
        long a = (long) Math.sqrt(n); 
        
        if(a*a == n){
            answer = (long)((a+1)*(a+1));
        } else {
            answer = -1;
        }
        
        return answer;
    }
}