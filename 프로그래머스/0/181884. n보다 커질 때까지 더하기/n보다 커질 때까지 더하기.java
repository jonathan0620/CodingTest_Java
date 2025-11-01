class Solution {
    public int solution(int[] numbers, int n) {
        // numbers 배열 int[]
        // 정수 n
        // 처음부터 하나 씩 더하다가 그 값이 n보다 커지는 순간!
        // 합을 return int
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                break;
            }
        }
        return answer;
    }
}