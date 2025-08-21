import java.util.Set;
import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        // 1. N/2를 구함
        // 2. 중복을 모두 제외한, 즉 종류의 개수를 구함
        // 3. N/2와 비교해서 정답을 반환
        // N/2가 클 경우 = 종류의 개수
        // N/2가 작을 경우 = N/2
        
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) set.add(num);
        
        return Math.min(nums.length / 2, set.size());
        
        /* 이전 풀이 - 실행속도 굉장히 불리함
        int type = (int)Arrays.stream(nums).distinct().count();
        
        return Math.min(nums.length / 2, type);
        */
    }
}