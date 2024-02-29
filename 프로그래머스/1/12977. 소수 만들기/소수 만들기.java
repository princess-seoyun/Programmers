class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // 서로 다른 3개를 선택하여 더한 값이 소수인지 확인
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) { // 소수인지 확인하는 함수 호출
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    // 소수 판별 함수
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // 0 으로 나누어 떨어지면 소수가 아님
                return false;
            }
        }
        return true;
    }
}
