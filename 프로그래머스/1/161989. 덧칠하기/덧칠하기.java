class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        // 현재까지 칠한 구간
        int k = 0;
        
        // 1미터 길이의 구역 n 개로 나누고 각 구역 왼쪽부터 순서대로 1번부터 n 번까지 번호
        // 벽에 페인트를 칠하는 롤러의 길이는 m 미터 롤러로 벽에 페인트를 한번 칠해야 하는 규칙
        
        for(int i = 0; i < section.length ; i++)
        {
            // 처음은 무조건 칠함
            if(i == 0)
            {
                answer++;
            }
            // 이미 색칠된 구간이 또 겹치면 패스
            else if(k>=section[i])
            {
                continue;
            }
            // 색칠이 필요한 구간
            else
            {
                if(k >= n) break; // 칠해야하는 전체 범위가 넘어가면 반복문 더 돌릴 필요 없음
                answer++;   
            }
            // 현재까지 칠해진 구간 계산
            k = section[i] + m - 1;
        }
        
        return answer;
    }
}