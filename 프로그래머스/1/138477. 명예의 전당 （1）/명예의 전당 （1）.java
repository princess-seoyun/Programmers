import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {

        // score 의 점수가 명예의 전당 점수의 최소보다 커야 들어감
        // 명예의 전당에서 제일 최하위 점수들을 answer 배열에 넣고 리턴
        int answer[] = new int[score.length];
        ArrayList<Integer> arr = new ArrayList<>(); // 명예의전당 배열
        
        for(int i = 0 ; i < score.length ; i++)
        {
            if(i == 0)
            {
                arr.add(score[i]);
                // System.out.println(arr[0]);
                answer[i] = arr.get(i);
            }
            else
            {
                if(i<k)
                {
                    arr.add(score[i]);
                    // System.out.println(arr[i]);
                }
                else
                {
                    if(score[i] < arr.get(0))
                    {
                        // answer[i] = arr[0];
                        // System.out.println(arr[i]);
                    }
                    else
                    {
                        if(arr.size() >= k)
                        {
                            arr.remove(0);
                        }
                        arr.add(score[i]);
                        // System.out.println(arr[i]);
                    }
                }
                // 오름차순으로 정렬
                arr.sort(Comparator.naturalOrder());
                // System.out.println(arr[0]);
                answer[i] = arr.get(0);
            }
        }
        
        return answer;
    }
}