import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 배열 arr의 각 원소는 0 ~ 9
        // O(N) - 배열을 한 번만 조회하면 충분히 할 수 있음
        
        // 이전 번호를 기억하는 prev(최초 -1)
        // 실제 정답 배열에 넣을 값을 담을 리스트 list
        int prev = -1;
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for (int num : arr) {
            
            // 이전 번호와 중복되지 않은 경우
            // prev를 갱신하고 리스트에 삽입
            if (prev != num) {
                prev = num;
                answerList.add(prev);
            }
        }
        
        return answerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}