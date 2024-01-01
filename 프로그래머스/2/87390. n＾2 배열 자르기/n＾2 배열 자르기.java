class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        int k = 0;
        
        for(long i = left ; i <= right; i++) {
            
            int a = (int)(i/n) + 1;
            int b = (int)(i%n) + 1;
            
            if(a<=b){
                answer[k++] = b;
            } else {
                answer[k++] = a;
            }
            
        }
        
        return answer;
    }
}