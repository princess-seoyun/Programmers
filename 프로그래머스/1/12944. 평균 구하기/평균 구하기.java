class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int num = 0;
        
        for(int i =0; i< arr.length ; i++)
        {
            num += arr[i];
        }
        
        answer = (double) num / arr.length;
        
        return answer;
    }
}