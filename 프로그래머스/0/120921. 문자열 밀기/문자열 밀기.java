import java.util.*;

class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;

        int n = A.length();
        for (int k = 1; k <= n; k++) {
            A = A.substring(n - 1) + A.substring(0, n - 1);
            if (A.equals(B)) return k;
        }
        return -1;
    }
}