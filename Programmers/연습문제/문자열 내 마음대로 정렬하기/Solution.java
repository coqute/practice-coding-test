import java.util.Arrays;

public class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
            else return s1.charAt(n) - s2.charAt(n);
        });
        return strings;
        
        /* 이전 풀이
        // index, char -> int 이중 배열 선언
        // Arrays.sort로 정렬
        // String 배열 선언 후, 인덱스 순서대로 넣어서 반환
        
        // 사전순으로 먼저 정렬
        Arrays.sort(strings);
        
        int[][] arr = new int[strings.length][2];
        for (int i = 0; i < strings.length; i++) {
            // 먼저 인덱스 저장
            arr[i][0] = i;
            
            // charAt으로 n번째 인덱스에 위치한 문자 저장
            arr[i][1] = strings[i].charAt(n);
        }
        // 저장된 문자 순서로 오름차순 정렬
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[arr[i][0]];
        }
        
        return answer;
        */
    }
}