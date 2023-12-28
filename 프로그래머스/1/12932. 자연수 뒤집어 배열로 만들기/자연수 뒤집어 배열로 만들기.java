class Solution {
    public int[] solution(long n) {
        String[] a = String.valueOf(n).split("");
        String[] b = new String[a.length];
        
        int[] answer = new int[a.length];
        
        for(int i = a.length-1 ; i >= 0 ; i--)
        {
            b[i] = a[i];
        }
        
        for(int i = 0 ; i < a.length ; i++)
        {
            answer[a.length-i-1] = Integer.parseInt(b[i]);
        }
        
        return answer;
    }
}