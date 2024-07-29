class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n 의 다음 큰 숫자는 2 진수로 변환 했을 때 1의 개수가 같으면서
        // n 보다 큰 수 중 제일 작은 수 return
        
        // Integer.bitCount = 정수를 매개변수로 넣었을때 그 정수의 1 의 개수를 반환
        int nCnt = Integer.bitCount(n); // n -> 2진 변환 1의 개수
        
        while(true){
            n++;

            int cnt = Integer.bitCount(n);
            
            if(cnt == nCnt) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}