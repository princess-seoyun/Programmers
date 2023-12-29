class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int b = 0; // x 총 값
        
        String[] a = String.valueOf(x).split("");
        
        for(int i = 0 ; i < a.length ; i++) {
            b += Integer.parseInt(a[i]); // String 배열에서 형변환 하는 거 잊지 마 
        }
        
        if(x%b!=0)
        {
            answer = false;
        }
        
        return answer;
    }
}