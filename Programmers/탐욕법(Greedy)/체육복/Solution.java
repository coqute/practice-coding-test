import java.util.Arrays;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 기본적인 체육수업을 들을 수 있는 학생 수
        int count = n - lost.length;
        
        // 인접한 학생이 여벌 체육복이 있는지 여부를 확인
        // lost, reserve 값의 차이가 0 ~ 1 이면 가능
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }
        
        for(int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(reserve[j] == -1) continue;
                
                if(Math.abs(lost[i] - reserve[j]) == 1) {
                    reserve[j] = -1;
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }
}