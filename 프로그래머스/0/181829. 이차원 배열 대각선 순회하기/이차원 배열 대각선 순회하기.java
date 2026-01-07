class Solution {
    public int solution(int[][] board, int k) {
        int row = board.length;
        int col = board[0].length;
        int sum = 0;

        for (int i = 0; i <= Math.min(row - 1, k); i++) {
            int jMax = Math.min(col - 1, k - i);
            for (int j = 0; j <= jMax; j++) {
                sum += board[i][j];
            }
        }

        return sum;
    }
}