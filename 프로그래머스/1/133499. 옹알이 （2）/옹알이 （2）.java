class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // 조카 발음
        String[] word = {"aya", "ye", "woo", "ma" };
        
        for(int i = 0; i < babbling.length ; i++)
        {
            // 연속되는 발음이 있는 단어는 패스
            if(babbling[i].contains("ayaaya") ||
               babbling[i].contains("yeye") ||
               babbling[i].contains("woowoo") ||
               babbling[i].contains("mama")) {
                continue;
            }
            
            for(int j = 0 ; j < word.length ; j++)
            {
                if(babbling[i].contains(word[j]))
                {

                    babbling[i] = babbling[i].replace(word[j] , " ");
                }
            }
            if(babbling[i].trim().isEmpty()) answer++;
        }
        
        return answer;
    }
}