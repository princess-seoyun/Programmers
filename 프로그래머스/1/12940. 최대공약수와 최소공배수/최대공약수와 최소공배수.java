import java.util.*;

class Solution {
    public long[] solution(int n, int m) {
        
        // 정답을 담을 배열
        long[] answer = new long[2];
        
        // 두 수의 최대공약수
        int gcdVal = gcd(n, m);
        
        // 두 수의 최소공배수
        long lcmVal = ((long)n * m) / gcdVal; 
        
        answer[0] = gcdVal;
        answer[1] = lcmVal;
        
        return answer;
    }
    
    // 재귀함수
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}



