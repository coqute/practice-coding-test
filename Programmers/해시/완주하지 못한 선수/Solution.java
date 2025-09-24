import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = null;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String name : participant) {
            map.compute(name, (k, v) -> v == null ? 1 : v + 1);
        }
        
        for(String name : completion) {
            map.compute(name, (k,v) -> v - 1  <= 0 ? null : v - 1);
        }
        
        for(String name : map.keySet()) {
            answer = name;
        }
        
        return answer;
    }
}