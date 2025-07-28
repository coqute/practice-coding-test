public class Solution {
    public int solution(String t, String p) {
        // O(N) - 순회
        // subString, Long.parseLong
        
        int count = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            if(Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p))
                count++;
        }
        
        return count;
    }
}