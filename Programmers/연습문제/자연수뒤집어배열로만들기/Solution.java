public class Solution {
    public int[] solution(long n) {
        int count = 0;
        long copy = n;
        while(copy > 0) {
            copy /= 10;
            count++;
        }
        
        int[] answer = new int[count];
        int i = 0;
        while(n > 0) {
            answer[i] = (int)(n % 10);
            n /= 10;
            i++;
        }
        
        return answer;
    }
}