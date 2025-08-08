public class Solution {
    public int solution(int a, int b, int n) {
        // n을 a로 나눈 몫과 나머지를 구함
        // 몫 * b + 나머지 = 남은 병의 개수
        // 이때, 몫 * b = 받은 병의 개수 -> answer에 누적
        // 몫이 0이 될 때까지 반복 -> answer 반환
        
        int answer = 0;
        int earn = 0;
        
        while(n >= a) {
            earn = (n / a) * b;
            
            answer += earn;
            n = earn + n % a;
        }
        
        return answer;
    }
}