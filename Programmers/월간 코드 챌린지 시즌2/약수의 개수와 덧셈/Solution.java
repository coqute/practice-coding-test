class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if(countMeasure(i) % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
    
    private int countMeasure(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0) count++;
        }
        return count;
    }
}