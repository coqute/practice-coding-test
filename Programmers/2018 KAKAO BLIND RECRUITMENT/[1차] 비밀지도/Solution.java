public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        int[][] value = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr1[i]);
            
            for(int j = 0; j < n; j++) {
                value[i][j] = (str.charAt(j) == '1') ? 1 : 0;
            }
        }
        
        for(int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr2[i]);
            
            for(int j = 0; j < n; j++) {
                value[i][j] += (str.charAt(j) == '1') ? 1 : 0;
            }
        }
        
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < n; j++) {
                if(value[i][j] == 0) {
                    sb.append(' ');
                    continue;
                }
                
                sb.append('#');
            }
            
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}