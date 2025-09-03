import java.util.Arrays;

public class Solution {
    public int[] solution(int N, int[] stages) {
        // 1. 스테이지별 이미 클리어한 유저 수를 담을 int 배열 선언
        int[] cleared = new int[N];
        
        // 2. 스테이지별 유저가 현재 머물고 있는 유저 수를 담을 int 배열 선언
        int[] staying = new int[N];
        
        for (int i = 0; i < stages.length; i++) {
            // 3-1. 이미 도달한 유저 수 누적
            for (int j = 0; j < stages[i] - 1; j++) {
                cleared[j]++;
            }
            
            // 3-2. 전부 클리어한 경우를 제외하고 현재 머물고 있는 스테이지 유저 수 누적
            if(stages[i] != N + 1)
                staying[stages[i] - 1]++;
        }
        
        // 4. 실패율 계산
        double[] failure = new double[N];
        for (int i = 0; i < N; i++) {
            failure[i] = (cleared[i] + staying[i] == 0) ? 0 : (double)staying[i] / (staying[i] + cleared[i]);
        }
        
        Integer[] order = new Integer[N];
        for (int i = 0; i < N; i++) order[i] = i;
        
        Arrays.sort(order, (a, b) -> {
            int cmp = Double.compare(failure[b], failure[a]);
            return (cmp != 0) ? cmp : Integer.compare(a, b);
        });
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) answer[i] = order[i] + 1;
        
        return answer;
    }
}