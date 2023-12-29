import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String b ="";
        
        String[] a = String.valueOf(n).split("");
        
        int[] c = new int[a.length];
        
        for(int i = 0 ; i < a.length ; i++)
        {
            c[i] = Integer.parseInt(a[i]);
        }
        
        // int 배열은 Integer 배열로 boxing(Primitive 자료형 -> Wrapper 클래스) 로 바꿔줘야 함
        // 왜 int 는 안 되고 Integer 만 되느냐 -> public static <T> void sort(T[] a Comparator<? super T>c){...}
        // 매개변수로 받아오는 c를 보면 Compartor<?super T>
        // T는 제네릭 클래스로 어떠한 객체도 받아오게 되어 있지만 int는 primitive data type으로 허용되지 않음
        Integer[] arr = Arrays.stream(c).boxed().toArray(Integer[]::new); // 박싱
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(int i = 0 ; i < a.length ; i++)
        {
            b += String.valueOf(arr[i]);
        }
        
        answer = Long.parseLong(b);
        
        return answer;
    }
}