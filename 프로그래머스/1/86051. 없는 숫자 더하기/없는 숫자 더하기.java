import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        ArrayList<Integer> num = new ArrayList<>();
        
        for(int i = 1 ; i < 10 ; i++)
        {
            num.add(i);
        }
        
        for(int i = 0 ; i < numbers.length ; i++) {
            for(int k = 0 ; k < num.size() ; k++) {
                if(num.get(k) == numbers[i]){
                    num.remove(k);
                }
            }
        }
        
        for(int i = 0 ; i < num.size() ; i++) {
            answer += num.get(i);
        }
        
        return answer;
    }
}