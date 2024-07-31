import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        String[] st = s.split("");
        
        Stack<String> ss = new Stack<>();
        
        ss.push(st[0]);
        
        for(int i = 1 ; i < st.length ; i++) {
            if(ss.isEmpty()) {
                ss.push(st[i]);
            } else if (ss.peek().equals(st[i])) {
                ss.pop();
            }
            else {
                ss.push(st[i]);
            }
        }
        
        
        if(ss.isEmpty()) {
            answer = 1;
        }
        
        return answer;
    }
}