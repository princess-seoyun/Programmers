class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String str = String.valueOf(num_str);
        String[] s = str.split("");
        
        for(int i = 0 ; i < s.length ; i++)
        {
            answer += Integer.parseInt(s[i]);
        }
        
        return answer;
    }
}