class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n);
        String[] s = str.split("");
        
        for(int i = 0 ; i < s.length ; i++)
        {
            answer += Integer.parseInt(s[i]);
        }
        
        return answer;
    }
}