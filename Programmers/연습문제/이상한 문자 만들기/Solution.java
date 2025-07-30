public class Solution {
    public String solution(String s) {
        // 한 개 이상의 단어 + 단어를 구분하는 하나 이상의 공백문자
        // 공백을 기준으로 분류 - 짝수 인덱스는 0, 공백 다음 인덱스
        
        StringBuilder sb = new StringBuilder();
        
        int innerIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                innerIdx = 0;
                sb.append(ch);
                continue;
            }
            
            ch = (innerIdx % 2 == 0) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
            sb.append(ch);
            innerIdx++;
        }
        
        return sb.toString();
    }
}