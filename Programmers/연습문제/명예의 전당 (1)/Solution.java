import java.util.Queue;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        Queue<Integer> queue = new PriorityQueue<>();
        
        for(int i = 0; i < score.length; i++) {
            queue.add(score[i]);
            
            if(queue.size() > k)
                queue.poll();
            
            answer[i] = queue.peek();
        }
        
        /* 기존 풀이
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
            
            Collections.sort(list);
            
            answer[i] = (i < k ? list.get(0) : list.get(i - k + 1));
        }
        */
        
        return answer;
    }
}