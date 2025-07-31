public class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(0, i);
            int nearIdx = str.lastIndexOf(s.charAt(i));
            
            answer[i] = (nearIdx != -1) ? i - nearIdx : -1;
        }
        
        return answer;
    }
}