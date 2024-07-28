import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < numbers.length ; i++) {
            for(int j = 0 ; j < numbers.length ; j++) {
                if(i!=j && !arr.contains(numbers[i]+numbers[j])) {
                    arr.add(numbers[i]+numbers[j]);
                }
            }
        }
        
        int[] answer = new int[arr.size()];
        Collections.sort(arr);
        
        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}