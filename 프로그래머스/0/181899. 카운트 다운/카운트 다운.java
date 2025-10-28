class Solution {
    public int[] solution(int start_num, int end_num) {
        int size = start_num - end_num + 1;
        int[] answer = new int[size];
        for (int i = start_num; i >= end_num; i--) {
            answer[start_num - i] += i; 
        }
        return answer;
    }
}