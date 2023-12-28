class Solution {
    public long[] solution(int x, int n) {
        // 배열 선언 해줘야 함, 아니면 ArrayIndexOutOfBoundsException 에러 뜸
        long[] answer = new long[n];
        
        for(int i = 1; i <= n ; i++)
        {
            answer[i-1] = (long) x*i;
        }

        return answer;
    }
}