public class Solution {
    public int solution(int n) {
        // 나머지와 몫을 통해 3진수를 구함
        
        /* 직접 3진수 계산
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        String str = sb.toString();
        int answer = 0;
        
        for (int i = 0; i < str.length(); i++) {
            answer += (int) (Integer.parseInt(str.substring(i, i + 1)) * Math.pow(3, i));
        }
        */
        
        String str = Integer.toString(n, 3);
        
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        
        return Integer.parseInt(sb.toString(), 3);
        
        

        
        return Integer.parseInt(sb.toString(), 3);
    }
}