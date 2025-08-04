public class Solution {
    public int solution(int[][] sizes) {
        // 1. 명함 최댓값
        // 2. 명함들을 순회하며 가로/세로 중 더 작은 값들의 최댓값
        // 1 * 2 = 모든 명함을 수납할 수 있는 가장 작은 지갑의 크기
        
        int bMax = 0;
        int sMax = 0;
        
        // 모든 배열 조회
        for (int i = 0; i < sizes.length; i++) {
            
            for (int j = 0; j < sizes[i].length; j++) {
                if (bMax < sizes[i][j]) bMax = sizes[i][j];
            }
            
            if(sMax < Math.min(sizes[i][0], sizes[i][1]))
                sMax = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        return bMax * sMax;
    }
}