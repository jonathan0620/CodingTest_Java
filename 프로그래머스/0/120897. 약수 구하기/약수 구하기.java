import java.util.*;
class Solution {
    public int[] solution(int n) {
        // n의 약수를 오름차순으로 담기
        // 몇 개가 생길 지 모르니까 일단 list로?
        
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}