public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // targets의 각 문자열 반복
        for(int tOut = 0; tOut < targets.length; tOut++) {
            // targets의 한 문자열 내부 각 문자 반복
            for(int tIn = 0; tIn < targets[tOut].length(); tIn++) {
                // 최대값을 넘는 101로 초기값 지정
                int count = 101;
                
                // keymap의 각 문자열 반복
                for (String str : keymap) {
                    
                    int idx = str.indexOf(targets[tOut].charAt(tIn));
                    
                    if (idx == -1) continue;
                    
                    if (count > idx + 1) count = idx + 1;
                }
                // keymap을 모두 조회했는데 여전히 101이라면 해당 문자가 아예 없음
                if(count == 101) {
                    answer[tOut] = -1;
                    break;
                }
                // keymap에서 조회한 최소값 누적
                answer[tOut] += count;
            }
        }
        
        return answer;
    }
}