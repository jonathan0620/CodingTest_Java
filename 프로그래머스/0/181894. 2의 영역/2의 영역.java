import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int left = -1, right = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) { left = i; break; }
        }
        if (left == -1) return new int[] { -1 };

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 2) { right = i; break; }
        }
        return Arrays.copyOfRange(arr, left, right + 1);
    }
}