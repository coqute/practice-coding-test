import java.util.*;

public class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        
        String[] arr = str.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++) {
            sb.append(arr[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}