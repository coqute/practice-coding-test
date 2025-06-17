public class Solution {
    public long solution(long n) {
        
        // 제곱근이 정수라면 n은 제곱수
        if(Math.sqrt(n) % 1 == 0) return (long)((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        else return -1;
    }
}