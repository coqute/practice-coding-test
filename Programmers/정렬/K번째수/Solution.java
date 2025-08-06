import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // Arrays.copyOfRange 사용하면 바로 정해진 범위 복사가능
        for(int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            
            int start = command[0] - 1;
            int end = command[1] - 1;
            int k = command[2];
            
            int[] temp = new int[end - start + 1];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = array[j + start];
            }
            
            Arrays.sort(temp);
            answer[i] = temp[k - 1];
        }
        
        return answer;
    }
}