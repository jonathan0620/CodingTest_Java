import java.util.*;
class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        if (len % 2 == 0) {
            for (int i = 1; i < len; i += 2) {
                arr[i] = arr[i] + n;
            }
        } else {
            for (int j = 0; j < len; j += 2) {
                arr[j] = arr[j] + n;
            }
        }
        return arr;
    }
}