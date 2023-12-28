class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String[] word = s.split("");
        
        int a = 0; // p 개수
        int b = 0; // y 개수
        
        for(int i = 0 ; i < word.length ; i++) {
            if(word[i].equals("p")|| word[i].equals("P")){
                a++;
            } else if(word[i].equals("y")|| word[i].equals("Y")) {
                b++;
            }
        }
        
        if(a!=b) {
            answer = false;            
        }

        return answer;
    }
}