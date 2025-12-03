import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int n = rank.length;
        
        int[][] arr = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            arr[i][0] = rank[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        
        int[] selected = new int[3];
        int count = 0;
        
        for (int i = 0; i < n && count < 3; i++) {
            int studentIndex = arr[i][1];
            
            if (attendance[studentIndex]) {
                selected[count] = studentIndex;
                count++;
            }
        }
        
        int a = selected[0];
        int b = selected[1];
        int c = selected[2];
        
        return 10000 * a + 100 * b + c;
    }
}