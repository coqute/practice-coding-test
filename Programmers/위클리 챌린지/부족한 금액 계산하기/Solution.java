public class Solution {
    public long solution(int price, int money, int count) {
        // 이용료 price원 (놀이기구를 N번째 이용 - N배의 이용료)
        // 놀이기구를 count번 타면(N = count) 금액의 얼마가 모자라는지 return
        // 모자라지 않으면 return 0
        long answer = money;
        
        for(int i = 1; i <= count; i++) {
            answer -= price * i;
        }
        return answer < 0 ? -answer : 0;
    }
}