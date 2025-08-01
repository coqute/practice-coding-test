public class Solution {
    public String solution(String s, int n) {
        // A ~ Z: 65 ~ 90
        // a ~ z: 97 ~ 122
        
        StringBuilder sb = new StringBuilder();
        int ascii = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(' ');
                continue;
            }
            
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch))
                ascii = (ch + n) > 90 ? ch + n - 26 : ch + n;
            else
                ascii = (ch + n) > 122 ? ch + n - 26 : ch + n;
            
            sb.append((char)ascii);
        }
        
        return sb.toString();
    }
}