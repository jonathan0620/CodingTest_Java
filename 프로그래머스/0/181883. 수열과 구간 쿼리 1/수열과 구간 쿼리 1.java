class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries 원소는 각 하나의 query를 나타냄 [s, e]
        // s <= i <= e 에 대해 arr[i]을 더한다.
        // 규칙에 따라 queries를 처리한 후
        // arr return[]
        // int[] answer = new int[arr.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int k = start; k <= end; k++) {
                arr[k]++;
            }
        }
        return arr;
    }
}