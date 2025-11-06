import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int ops = 0;

        for (int x : num_list) {
            while (x > 1) {
                if ((x & 1) == 0) {
                    x /= 2;
                } else {
                    x = (x - 1) / 2;
                }
                ops++;
            }
        }
        return ops;
    }
}