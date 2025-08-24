public class Solution {
    public int solution(int n, int m, int[] section) {
        int roller = section[0];
        int cnt = 1;
        
        for (int i = 1; i < section.length; i++) {
            if(roller + m - 1 < section[i]) {
                cnt++;
                roller = section[i];
            }
        }
        
        return cnt;
        
        /* 이전 풀이 - 위와 과정은 동일하지만 불필요한 조건문과 반복문이 포함됨
        int painting = 0;
        int painted = 0;
        
        for (int i = 0; i < section.length; i++) {
            // 가장 마지막에 도달할 경우
            if(i + 1 == section.length) {
                if(painted < section[i]) painting++;
                break;
            }
            
            painting++;
            
            // 현재 section[i]에서 페인트칠을 시작한 경우
            // 최대 section[i] + m - 1까지 칠할 수 있음
            painted = section[i] + m - 1;
            
            while(painted >= section[i + 1]) {
                if(i + 2 == section.length)
                    break;
                
                i++;
            }
        }
        
        return painting;
         */
    }
}