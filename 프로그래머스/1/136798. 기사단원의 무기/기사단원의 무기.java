import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        // 1번부터 number까지 번호까지 각 약수를 배열에 저장    
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 1 ; i <= number ; i++) {
            
            int cnt = 0; // 약수 개수 추가할 것
            
            for(int j = 1 ; j <=i/2 ; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }
            
            cnt++; // 본인의 수도 포함            
            arr.add(cnt);      
        }
        
        
        
        // 각 약수의 개수가 limit 를 초과하지 않는 경우만
        // power 와 곱해서 합계 구하기
        for(int i = 0 ; i < arr.size() ; i++) {
            if(arr.get(i) <= limit) {
                answer += arr.get(i); // 공격력 제한 안 넘는 경우
            } else {
                answer += power; // 공격력 제한 넘는 경우에는 power로 대신 구매
            }
        }
        
        return answer;
    }
}