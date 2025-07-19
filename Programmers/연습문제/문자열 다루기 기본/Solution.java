public class Solution {
    public boolean solution(String s) {
        // 문자열 s의 길이 (4 or 6) and 숫자로만 구성
        // return true/false
        
        if(s.length() != 4 && s.length() != 6) return false;
        
        return s.chars().allMatch((x) -> 48 <= x && x <= 57);
    }
}