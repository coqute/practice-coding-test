import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] answers) {
        
        // 수포자의 찍기 패턴
        int[][] student = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] score = new int[student.length];
        
        // 각각 수포자의 정답 수를 구함
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < student.length; j++) {
                if (answers[i] == student[j][i % student[j].length]) {
                    score[j]++;
                }
            }
        }
        
        // 수포자 중 가장 많은 문제를 맞힌 사람의 정답 수를 구함
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        // Stream을 통해 최대 정답 수에 해당하는 학생의 번호를 배열로 반환
        return IntStream.range(0, score.length)
                .filter(i -> score[i] == max)
                .map(i -> i + 1)
                .toArray();
    }
}