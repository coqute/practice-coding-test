class Solution {
    boolean solution(String s) {
        
        int pCount = 0;
        int yCount = 0;
        String lowerS = s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++) {
            if(lowerS.charAt(i) == 'p') {
                pCount++;
            } else if(lowerS.charAt(i) == 'y') {
                yCount++;
            }
        }
        
        return ((pCount == yCount) || (pCount + yCount == 0)) ? true : false;
    }
}