import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] arr2 = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++) {
            arr2[i] = arr[i];
        }
        
        if(arr.length == 1)
        {
            answer = new int[1];
            answer[0] = -1;
        } else {
            Arrays.sort(arr2);
            // 정렬 후 제일 작은 수 담기
            int num = arr2[0]; 
            
            answer = new int[arr.length-1]; // 1개 빼고 반환할 거니까 1 빼줌
            int k = 0; // 중간 인덱스 값을 뺄 거 생각해서
            
            for(int i = 0 ; i < arr2.length ; i++) {
                if(arr[i] != num) {
                    answer[k] = arr[i];
                    k++;
                } else { 
                    continue;
                }
            }
        }
        
        
        return answer;
    }
}