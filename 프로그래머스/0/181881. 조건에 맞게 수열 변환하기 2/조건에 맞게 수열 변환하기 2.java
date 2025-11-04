import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int count = 0;

        while (true) {
            int[] next = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                int x = arr[i];
                if (x >= 50 && x % 2 == 0) next[i] = x / 2;
                else if (x < 50 && x % 2 == 1) next[i] = x * 2 + 1;
                else next[i] = x;
            }

            if (Arrays.equals(arr, next)) break;
            arr = next;
            count++;
        }

        return count;
    }
}