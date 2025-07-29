public class Solution {
    public int solution(int[] number) {
        // 정수, 세 정수를 더했을 때 0이면 삼총사
        // 경우의 수 - 3중 for문 one, two, three
        
        int count = 0;
        for (int one = 0; one <= number.length - 3; one++) {
            for (int two = one + 1; two <= number.length - 2; two++) {
                for (int three = two + 1; three <= number.length - 1; three++) {
                  
                    if (number[one] + number[two] + number[three] == 0) count++;
                }
            }
        }
        
        return count;
    }
}