public class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            
            for(int j = 0; j < index; j++) {
                ascii = (ascii - 'a' + 1) % 26 + 'a';
                
                if(skip.contains((char)ascii + "")) j--;
            }
            
            sb.append((char)ascii);
        }
        
        return sb.toString();
    }
}