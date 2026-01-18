class Solution {
    public double solution(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double answer = 0;
        answer = (double) sum / n;
        return answer;
    }
}