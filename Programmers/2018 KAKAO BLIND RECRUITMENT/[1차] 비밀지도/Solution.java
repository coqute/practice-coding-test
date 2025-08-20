public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String str = null;
        
        // 비트 연산자 or 활용
        for(int i = 0; i < n; i++) {
            str = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            StringBuilder sb = new StringBuilder();
            
            sb.append("0".repeat(n - str.length()));
            sb.append(str);
            
            str = sb.toString();
            str = str.replaceAll("0", " ");
            str = str.replaceAll("1", "#");
            
            answer[i] = str;
        }
        
        return answer;
        
        /*
        // 이전 풀이 - 속도 상으로 이점이 크지만, 중복 코드 있음
        // 중복 코드만 하나의 매서드로 구별되게 만들 수 있다면 더 효율적임
        int[][] value = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr1[i]);
            
            StringBuilder sb = new StringBuilder();
            
            sb.append("0".repeat(n - str.length()));
            sb.append(str);
            str = sb.toString();
            
            for(int j = 0; j < n; j++) {
                value[i][j] = (str.charAt(j) == '1') ? 1 : 0;
            }
        }
        
        for(int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr2[i]);
            
            StringBuilder sb = new StringBuilder();
            
            sb.append("0".repeat(n - str.length()));
            sb.append(str);
            str = sb.toString();
            
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
        */
    }
}