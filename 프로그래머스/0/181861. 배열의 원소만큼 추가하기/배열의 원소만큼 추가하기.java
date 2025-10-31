import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int totalLen = 0;
        for (int n : arr) {
            totalLen += n;
        }
        
        int[] answer = new int[totalLen];
        int idx = 0;

        for (int n : arr) {
            for (int j = 0; j < n; j++) {
                answer[idx++] = n;
            }
        }
        return answer;
    }
}