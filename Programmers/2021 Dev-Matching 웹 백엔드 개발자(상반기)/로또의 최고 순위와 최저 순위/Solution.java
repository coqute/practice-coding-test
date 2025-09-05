public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 최고 순위: 0을 맞은 숫자로 취급
        // 최저 순위: 0을 틀린 숫자로 취급
        
        int correct = 0;
        int zero = 0;
        
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                zero++;
                continue;
            }
            
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    correct++;
                    break;
                }
            }
        }
        
        return new int[] { Math.min(6, 7 - (correct + zero)), Math.min(6, 7 - correct) };
    }
}