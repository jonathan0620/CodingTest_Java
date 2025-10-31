import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        // n번째 이후 원소들과 n번째까지 원소들로 나눔
        // n번째 이후의 원소들을 n번째까지 원소들 앞에 붙인
        // 리스트를 return
        // n번째를 기준으로 리스트를 잘라서 두개를 합치기
        // concat copyOfRange substring

        int[] slice1 = Arrays.copyOfRange(num_list, 0, n);
        int[] slice2 = Arrays.copyOfRange(num_list, n, num_list.length);

        int[] answer = new int[num_list.length];
        System.arraycopy(slice2, 0, answer, 0, slice2.length);
        System.arraycopy(slice1, 0, answer, slice2.length, slice1.length);

        return answer;
    }
}