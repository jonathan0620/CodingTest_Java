import java.util.*;
class Solution {
	public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            int size = end - start + 1;

            int[] cutArray = new int[size];
            int idx = 0;
            for (int j = start - 1; j < end; j++) {
                cutArray[idx] = array[j];
                idx++;
            }

            Arrays.sort(cutArray);

            answer[i] = cutArray[k - 1];
        }
        return answer;
    }
}