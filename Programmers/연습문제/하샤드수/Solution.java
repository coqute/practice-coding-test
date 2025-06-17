public class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int copy = x;
        while(copy > 0) {
            sum += copy % 10;
            copy /= 10;
        }
        
        return x % sum == 0 ? true : false;
    }
}