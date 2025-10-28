import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>(); // -> 스택 사용
        
        for (int i = 0; i < moves.length; i++) { // moves 는 인덱스
            int idx = moves[i] - 1; // 인덱스는 0부터 시작하니까
            for (int j = 0; j < board.length; j++) {
                if (board[j][idx] != 0) {
                    int doll = board[j][idx]; // j는 행. 인형 찾음
                    board[j][idx] = 0; // 인형 찾았으니 없애야함
                if (stk.isEmpty()) {
                    stk.push(doll); // 스택에 인형을 넣음
                } else {
                    if (stk.peek() == doll) { // 맨 위가 들어간 인형과 같으면
                        stk.pop(); // 위에 인형 없앰
                        answer += 2; // 터트려 사라진 인형
                    } else {
                        stk.push(doll);
                    }
                }
                    break;
                }
            }
        }
        // 인형 없으면 아무 일도 안 일어남
        
        // 2차원 배열 board
        // 크레인 작동 moves
        // 터트려져 사라진 인형 개수 return
        
        return answer;
    }
}