class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int swp = 0;
        if(a > b) 
        {
            swp = a;
            a = b;
            b = swp;
        }
        
        System.out.println(a);
        System.out.println(b);
        
        
        while(true)
        {
            answer += a;
            if(a==b) break;
            a++;
        }
        
        return answer;
    }
}