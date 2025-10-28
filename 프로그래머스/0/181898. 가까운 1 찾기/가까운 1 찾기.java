class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        // arr은 0 아니면 1
        // idx 보다 크면서 배열의 값이 1인 가장 작은 인덱스 값으로
        // 없으면 -1 반환
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}