class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];

        int[] dr = {0, 1, 0, -1}; // right, down, left, up
        int[] dc = {1, 0, -1, 0};

        int r = 0, c = 0, dir = 0;
        for (int num = 1; num <= n * n; num++) {
            arr[r][c] = num;

            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] != 0) {
                dir = (dir + 1) % 4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            }

            r = nr;
            c = nc;
        }

        return arr;
    }
}