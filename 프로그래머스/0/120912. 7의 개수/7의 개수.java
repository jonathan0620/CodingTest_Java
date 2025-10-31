import java.util.*;
class Solution {
    public int solution(int[] array) {
        // array가 매개변수로 주어질 떄 7이 몇개 잇는지 return
        // int[]를 String[]으로 변환
        int count = 0;
        for (int n : array) {
            String s = String.valueOf(n);
            for (char c : s.toCharArray()) {
                if (c == '7') count++;
            }
        }
    
        return count;
    }
}