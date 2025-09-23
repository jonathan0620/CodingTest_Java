import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int h = 3; h * h <= total; h++) { 
            if (total % h != 0) continue;
            int w = total / h;
            if (w < h) continue;

            int inner = (w - 2) * (h - 2);
            if (inner == yellow) {
                return new int[] { w, h };
            }
        }
        return new int[] { -1, -1 };
    }
}