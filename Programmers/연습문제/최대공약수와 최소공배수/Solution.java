public class Solution {
    public int[] solution(int n, int m) {
        // 두 수의 곱 = 최대공약수 * 최소공배수
        //  최대공약수 - 순회, 유클리드 호제법
        
        int[] answerArr = new int[2];
        int gcd = 0;
        
        for(int i = 1; i <= Math.min(n, m); i++) {
            if(n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        
        answerArr[0] = gcd;
        answerArr[1] = n * m / gcd;
        
        return answerArr;
    }
}