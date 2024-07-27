import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0 ; i < A.length ; i++) {
            pq.offer(A[i]);
            pq2.offer(B[i]);
        }
        
        for(int i = 0 ; i < A.length ; i++) {
            answer += pq.peek() * pq2.peek();
            // 사용한 값은 삭제
            pq.remove();
            pq2.remove();
            // System.out.println(answer);
        }

        return answer;
    }
}