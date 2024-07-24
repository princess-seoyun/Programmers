import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] st = s.split("\\s"); // 띄어쓰기 기준으로 숫자 나누기
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < st.length ; i++) {
            arr.add(Integer.parseInt(st[i]));
        }
        
        int size = arr.size() - 1;
        
        Collections.sort(arr);
        
        answer = Integer.toString(arr.get(0)) + " " +  
            Integer.toString(arr.get(size)) ;
        
        return answer;
    }
}