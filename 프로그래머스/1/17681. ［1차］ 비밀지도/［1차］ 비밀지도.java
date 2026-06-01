class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for(int i = 0 ; i < arr1.length ; i++)
        {
            String str = "";
            
            String binary = Integer.toBinaryString(arr1[i]); // 10진수 -> 2진수
            binary = String.format("%" + n + "s", binary).replace(' ', '0');
            
            String binary2 = Integer.toBinaryString(arr2[i]); // 10진수 -> 2진수
            binary2 = String.format("%" + n + "s", binary2).replace(' ', '0');
            
            // System.out.println(binary2);
            
            for(int j = 0 ; j < n ; j++)
            {
                // System.out.println(binary.charAt(j));
                if(binary.charAt(j) == '1' || binary2.charAt(j) == '1' )
                {
                    str += "#";
                }
                else
                {
                    str += " ";
                }
            }
            
            answer[i] = str;
        }
        
        
        return answer;
    }
}