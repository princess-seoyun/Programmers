class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] num = phone_number.split("");
        
        for(int i = num.length-5 ; i >= 0 ; i--) {
            num[i] = num[i].replace(num[i],"*");
        }
        
        for(int i = 0 ; i < num.length ; i++) {
            answer += num[i];
        }        
        return answer;
    }
}