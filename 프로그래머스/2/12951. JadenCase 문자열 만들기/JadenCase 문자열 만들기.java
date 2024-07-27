class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 띄어쓰기 기준으로 문자열 자르기
        String[] st = s.split(" ", -1); // -1 을 추가하면 빈값도 배열에 담을 수 있음
        
        int a = 0;
        
        for(int i = 0 ; i < st.length ; i++) {
            String[] st2 = st[i].split(""); 
            st2[0] = st2[0].toUpperCase();
            st[i] = st2[0];
            if(!st[i].isEmpty()) {
                for(int k = 1 ; k < st2.length ; k++) {
                    st[i] += st2[k].toLowerCase();
                }
            }
            answer += st[i];
            if(i != st.length -1 ) {
                answer += " ";
            }
        } 
        
        return answer;
    }
}