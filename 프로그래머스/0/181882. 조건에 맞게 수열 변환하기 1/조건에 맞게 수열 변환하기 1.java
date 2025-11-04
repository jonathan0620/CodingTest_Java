class Solution {
    public int[] solution(int[] arr) {
        // arr 각 원소 값이 50보다 크거나 같고 짝수면 2로 나누고
        // 50보다 작은 홀수면 2를 곱함
        // 정수 배열 반환함
        
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= 50) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] % 2 == 1 && arr[i] < 50) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}