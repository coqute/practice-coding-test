import java.util.Arrays;
import java.util.stream.IntStream;
public class Solution {
    public int[] solution(int[] answers) {
        
        int[][] student = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] score = new int[student.length];
        
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < student.length; j++) {
                if (answers[i] == student[j][i % student[j].length]) {
                    score[j]++;
                }
            }
        }
        
        int max = Arrays.stream(score).max().getAsInt();
        
        return IntStream.range(0, score.length)
                .filter(i -> score[i] == max)
                .map(i -> i + 1)
                .toArray();
    }
}