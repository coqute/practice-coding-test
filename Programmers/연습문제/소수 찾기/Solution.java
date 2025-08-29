public class Solution {
    public int solution(int n) {
        int count = 0;
        
        // 라벨링을 활용한 2중 for문
        outer:
        for (int i = 2; i <= n; i++) {
            // 소수를 판별할 때, 제곱근까지만 구해도 구할 수 있음
            // 합성수의 인수, 즉 약수 중에는 반드시 제곱근보다 작거나 같은 게 존재함
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0)
                    continue outer;
            }
            count++;
        }
        
        return count;
    }
}