import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        // 최대한 많은 부서를 지원해줘야 함
        // sort를 해서 지원금액이 적은 것부터 지원한다면?
        
        Arrays.sort(d);
        
        int count = 0;
        for (int num : d) {
            budget -= num;
            
            if (budget < 0) break;
            
            count++;
        }
        
        return count;
    }
}