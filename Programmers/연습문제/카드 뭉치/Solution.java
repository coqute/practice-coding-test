public class Solution {
    public String solution(String[] card1, String[] card2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;
        
        for (int i = 0; i < goal.length; i++) {
            if(idx1 < card1.length && goal[i].equals(card1[idx1])) idx1++;
            if(idx2 < card2.length && goal[i].equals(card2[idx2])) idx2++;
        }
        
        return idx1 + idx2 == goal.length ? "Yes" : "No";
    }
}