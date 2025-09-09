public class Solution {
    public int solution(String s) {
        char ch = ' ';
        int count = 0;
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(count == 0) ch = s.charAt(i);
            
            if(s.charAt(i) == ch) count++;
            else count--;
            
            if(count == 0) answer++;
        }
        
        if(count != 0) answer++;
        
        return answer;
    }
}