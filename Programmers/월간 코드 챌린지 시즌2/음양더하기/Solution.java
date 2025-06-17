public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int[] arr = parse(absolutes, signs);
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return sum;
    }
    
    private int[] parse(int[] absolutes, boolean[] signs) {
        
        int[] arr = new int[signs.length];
        
        for(int i = 0; i < signs.length; i++) {
            arr[i] = signs[i] ? absolutes[i] : absolutes[i] * -1;
        }
        
        return arr;
    }
}