public class Solution {
    public int solution(String dartResult) {
        int[] score = new int[4];
        
        for (int i = 0, scoreIdx = 1; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            // 현재가 0이고, 이전 숫자가 1이었다면 점수는 10
            if(ch == '0' && score[scoreIdx - 1] == 1) {
                score[scoreIdx - 1] = 10;
                continue;
            }
            
            // 0 ~ 9라면, 점수를 저장하고 다음 인덱스로 넘어감
            if('0' <= ch && ch <= '9') {
                score[scoreIdx++] = ch - '0';
                continue;
            }
            
            // S는 1제곱이기 때문에 제외
            if(ch == 'D') {
                score[scoreIdx - 1] = (int)Math.pow(score[scoreIdx - 1], 2);
                
            } else if(ch == 'T') {
                score[scoreIdx - 1] = (int)Math.pow(score[scoreIdx - 1], 3);
                
            } else if(ch == '*'){
                score[scoreIdx - 1] *= 2;
                score[scoreIdx - 2] *= 2;
                
            } else if(ch == '#') {
                score[scoreIdx - 1] *= -1;
            }
        }
        
        int sum = 0;
        for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        
        return sum;
    }
}