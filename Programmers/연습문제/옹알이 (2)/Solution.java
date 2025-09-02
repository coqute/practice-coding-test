public class Solution {
    public int solution(String[] babbling) {
        // 1. 반복되는 발음을 제외한다.
        // 2. 반복되지 않으면서 발음 가능한 것들을 " " 공백으로 대체한다.
        // 3. 공백을 제외한 문자열의 길이가 0이면 발음 가능, 그 이외면 발음 불가능
        
        String[] announce = {"aya", "ye", "woo", "ma"};
        String[] noAnnounce = {"ayaaya", "yeye", "woowoo", "mama"};
        
        int answer = 0;
        
        outer:
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < noAnnounce.length; j++) {
                if(babbling[i].contains(noAnnounce[j])) {
                   continue outer;
                }
                
                babbling[i] = babbling[i].replaceAll(announce[j], " ");
            }
            
            if(babbling[i].trim().isEmpty()) answer++;
        }
        
        return answer;
    }
}