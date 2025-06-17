public class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        // 45 = 0 ~ 9 합
        
        for(int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        
        return answer;
    }
}