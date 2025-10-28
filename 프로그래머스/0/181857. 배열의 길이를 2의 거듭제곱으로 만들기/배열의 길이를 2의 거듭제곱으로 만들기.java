import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        // 정수 배열 arr
        // arr의 길이가! 2의 정수 거듭제곱이 되도록 0을 추가하려고 함
        // 최소한의 갯수로 arr 추가한 배열 int[] return
        
        int len = arr.length;
        
        int x = 1;
        while (x < len) {
            x*=2;
        }
        
        int[] answer = Arrays.copyOf(arr, x);
        
        return answer;
    }
}