import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        // 정수 n
        // 정수 3개가 담긴 slicer a, b, c
        // 정수 여러개 담긴 리스트 num_list
        
        int[] answer;
        
        // n = 1 num_list의 0번부터 b번까지
        // n = 2 list의 a번부터 마지막까지
        // n = 3 list의 a번부터 b번까지
        // n = 4 list의 a번부터 b번까지 c간격으로
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if (n == 1) {
            answer = Arrays.copyOfRange(num_list, 0, b + 1);
        } else if (n == 2) {
            answer = Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            answer = Arrays.copyOfRange(num_list, a, b + 1);
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = a; i <= b; i += c){
                list.add(num_list[i]);
            }
            
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] += list.get(i);
            }   
        }
    
        return answer;
    }
}