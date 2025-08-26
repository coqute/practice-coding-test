import java.util.Arrays;

public class Solution {
    public int solution(int k, int m, int[] score) {
        // 점수가 가장 높은 사과를 가장 먼저 박스에 담음
        // 내림차순으로 박스를 채워나가면 됨
        int answer = 0;
        
        Arrays.sort(score);
        
        for (int i = score.length - m; i >= 0; i -= m) {
            
            answer += score[i] * m;
        }
        
        return answer;
    }
}