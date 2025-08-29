public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 첫 번째 숫자
        for (int i = 0; i < nums.length - 2; i++) {
            // 두 번째 숫자
            for (int j = i + 1; j < nums.length - 1; j++) {
                // 세 번째 숫자
                for (int k = j + 1; k < nums.length; k++) {
                    // 소수인지 확인
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++;  // 만약 소수가 맞다면 answer는 1 증가한다.
                    }
                }
            }
        }
        
        return answer;  // answer 반환
    }
    
    // 소수인지 확인하는 메서드
    private boolean isPrime(int num) {
        
        // 2부터 자기 자신(num) 전까지 나누어 떨어지는 숫자가 있는지 확인
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // 나누어 떨어진다면 false 반환
            }
        }
        
        return true;  // 나누어 떨어지지 않았다면 true 반환
    }
}