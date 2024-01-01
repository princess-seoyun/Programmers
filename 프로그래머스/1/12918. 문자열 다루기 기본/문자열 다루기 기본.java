class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        String[] a = s.split("");
        
        if(a.length == 4 || a.length == 6) {
                for(int i = 0 ; i < a.length ; i++) {
                if(s.charAt(i) > 57) { // 아스키 코드 값으로 비교할 경우이므로 ''를 붙여야 줘야 함
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }
        return answer;
    }
}