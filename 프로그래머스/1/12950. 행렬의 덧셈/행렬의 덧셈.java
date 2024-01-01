class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length]; // arr1[0].length 으로 넣은 이유는 arr1의 열의 개수를 기준으로 설정해야 함
        
        for(int i = 0 ; i < arr1.length ; i++) {
           for(int j = 0 ; j < arr1[0].length ; j++) { // 범위 지정에서도 마찬가지로 arr1의 열의 개수를 기준으로 설정
               answer[i][j] = arr1[i][j] + arr2[i][j];
           }
        }
        
        return answer;
    }
}