public class Solution {
    public String solution(int[] food) {
        
        StringBuilder sb = new StringBuilder();
        
        // 2를 나눈 몫만큼 절반의 음식을 배치
        for (int i = 1; i < food.length; i++) {
            for (int count = 0; count < food[i] / 2; count++)
                sb.append(i);
        }
        
        // sb 복사본 생성
        StringBuilder sbReverse = new StringBuilder(sb);
        
        // 물과 뒤집혀진 sb 추가
        sb.append(0);
        sb.append(sbReverse.reverse());
        
        return sb.toString();
    }
}