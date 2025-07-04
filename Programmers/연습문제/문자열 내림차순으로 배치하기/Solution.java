import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String solution(String s) {
        char[] arr  = s.toCharArray();
        
        Arrays.sort(arr);
        
        StringBuilder answer = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--) {
            answer.append(arr[i]);
        }
        
        return answer.toString();
    }
}