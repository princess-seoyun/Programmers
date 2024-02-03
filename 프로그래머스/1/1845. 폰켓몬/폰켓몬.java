import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 1. n/2 마리 선택 가능
        // 2. n/2 중 종류를 가장 다양하게 선택
        // 3. 아니면 n/2 가 종의 수보다 큰 경우에는 큰 경우로 출력
        // 4. 아니면 n/2 가 종의 수보다 작으면 n/2 로 출력
        
        int num = nums.length / 2 ; // n/2 마리
        
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        
        if(num >= set.size()) {
            answer = set.size();
        } else {
            answer = num;
        }
        
        return answer;
    }
}