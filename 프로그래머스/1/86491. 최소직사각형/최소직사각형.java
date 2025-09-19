import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0, maxHeight = 0;
        
        for (int[] card : sizes) {
            Arrays.sort(card);
            int w = card[0];
            int h = card[1];
            
            if (w > maxWidth) maxWidth = w;
            if (h > maxHeight) maxHeight = h;
        }
        return maxWidth * maxHeight;
    }
}