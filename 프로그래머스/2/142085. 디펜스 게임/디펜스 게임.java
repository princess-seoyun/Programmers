// class Solution {
//     public int solution(int n, int k, int[] enemy) {
//         int answer = 0;
        
//         // 1번 무식한 방법 ...
//         // n 명으로 연속되는 적의 공격을 막는 게임
//         // 매 라운드에는 enemy[i] 마리의 적이 등장
//         // 남은 병사보다 현재 라운드의 적의 수가 적으면 게임 종료
        
//         // 무적권이라는 스킬이 있는데 최대 k 번 사용 가능
//         // 사용하면 병사의 소모 없이 한 라운드를 패스함
        
//         // 몇 라운드까지 막을 수 있는지 구하기
        
//         // 일단 몇 라운드를 무적권으로 막을 건지 결정해야 함
//         for(int i = 0; i < enemy.length ; i++) {
//             // 무적권도 다 쓰고 준호 병사도 작은 경우 = 게임 져서 끝
//             // 준호의 병사가 0 임
//             if((n < enemy[i] && k == 0) || (n <= 0 && k == 0)) {
//                 // System.out.println(k + " a " +  n);
//                 // System.out.println(i + " 라운드 끝 ");
//                 answer = i;
//                 break;
//             }
            
//             // 준호 병사가 더 적지만 무적권이 남은 경우
//             if(k>0 && n < enemy[i]) {
//                 // System.out.println(k + " b " +  n);
//                 // System.out.println(i + " 라운드 끝 ");
//                 k--;
//                 answer = i + 1;
//                 continue;
//             }
            
//             // 무적권 쓸 만큼 상대 병사 수가 많음
//             if(enemy[i] > n / 2  && k > 0) {
//                 // System.out.println(k + " c " +  n);
//                 // System.out.println(i + " 라운드 끝 ");
//                 k--;
//                 answer = i + 1;
//                 continue;
//             }
//             // System.out.println(k + " d " +  n);
//             // System.out.println(i + " 라운드 끝 ");
//             n -= enemy[i];
//             answer = i + 1;
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        
        // 우선순위 큐인 PriorityQueue 를 사용해서 문제 풀기
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < enemy.length ; i++) {
            // 요소 삽입
            pq.offer(enemy[i]);
            
            if(pq.size() <= k) {
                answer++;
                continue;
            }
            
            // 요소 제거 (poll)
            n -= pq.poll();
            
            if(n < 0) {
                break;
            }
            
            answer++;
            
        }
        return answer;
    }
}