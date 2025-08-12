import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
            
            Collections.sort(list);
            
            answer[i] = (i < k ? list.get(0) : list.get(i - k + 1));
        }
        return answer;
    }
}