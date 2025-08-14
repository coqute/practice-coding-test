public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int num = 1; num <= number; num++) {
            int sqrt = (int)(Math.sqrt(num));
            int count = 0;
            
            for (int n = 1; n <= sqrt; n++) {
                if(num % n == 0) count++;
            }
            
            count *= 2;
            
            if(sqrt * sqrt == num) count--;
            
            if(count > limit) count = power;
            
            answer += count;
        }
        
        return answer;
    }
}