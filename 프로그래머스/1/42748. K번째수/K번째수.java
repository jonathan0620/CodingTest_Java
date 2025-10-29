import java.util.*;
class Solution {
	public int[] solution(int[] array, int[][] commands) {
        
        // 배열을 i부터 j까지 자르고 k번째 수 구하기.
        // 배열 자르기 -> 거기서 K번째 수 찾기
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) { // commands 수 만큼 돌기
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int target = commands[i][2] - 1;
            
            int sliced[] = Arrays.copyOfRange(array, start, end);
            Arrays.sort(sliced);
            answer[i] = sliced[target];
        
        }
    
        
        return answer;
    }
}