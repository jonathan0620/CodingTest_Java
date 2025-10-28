import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        // array 들어있는 정수 중 n과 가장 가까운 수 출력!
        // array 돌아가면서 모든 수를 n과 비교
        // 가장 가까운 수는 절댓값 거리 |n-x|
        // 가장 작은 절댓값 구하기
        // 최소 거리 min
        // 그때 수 closset
        int[] abs = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            abs[i] = Math.abs(n - array[i]);
        }
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < abs.length; i++) {
            if (abs[i] < min) {
                min = abs[i];
            }
        }
        
        int answer = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(n - array[i]) == min) {
                if (array[i] < answer) {
                    answer = array[i];
                }
            }
        }
        
        return answer;
    }
}