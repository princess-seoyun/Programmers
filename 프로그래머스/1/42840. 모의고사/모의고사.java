class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        // 1 2 3 4 5 => 5개
        // 2 1 , 2 3 , 2 4 , 2 5 => 8개
        // 3 3 , 1 1 , 2 2, 4 4 , 5 5 => 10개
        
        int a = 0; // 1번 학생의 정답수
        int b = 0; // 2번 학생의 정답수
        int c = 0; // 3번 학생의 정답수
        
        int[] aa = {1,2,3,4,5};
        int[] bb = {2,1,2,3,2,4,2,5};
        int[] cc = {3,3,1,1,2,2,4,4,5,5};
        
        for (int i = 0; i < answers.length; i++) {
            int aaIndex = i % aa.length;
            int bbIndex = i % bb.length;
            int ccIndex = i % cc.length;

            if(answers[i] == aa[aaIndex]) {
                a++;
            }
            
            if(answers[i] == bb[bbIndex]) {
                b++;
            }
            
            if(answers[i] == cc[ccIndex]) {
                c++;
            }
        }
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        // 높은 점수순으로 정렬해서 return
        if (a == b && a == c) {
            answer = new int[]{1, 2, 3};
        } else if (a > b && a > c) {
            answer = new int[]{1};
        } else if (b > a && b > c) {
            answer = new int[]{2};
        } else if (c > a && c > b) {
            answer = new int[]{3};
        } else if (a == b && a > c || b > c) {
            answer = new int[]{1, 2};
        } else if (b == c && b > a || c > a) {
            answer = new int[]{2, 3};
        } else if (a == c && a > b || c > b) {
            answer = new int[]{1, 3};
        }
        
        return answer;
    }
}