import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        // 주어진 구간으로 배열을 잘라서 다 더해서 return
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            for (int k = start; k <= end; k++) {
                list.add(arr[k]);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}