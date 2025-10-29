import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 같은 종류의 폰켓몬은 같은 번호
        // 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 
        // 그때의 폰켓몬 종류 번호의 개수를 return 
        
        // N 마리 중 N / 2 마리 골라야 함
        // 최대 고를 수 있는 폰켓몬의 종류
        
        // set으로 중복 제거?
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int len = nums.length;
        
        int setLen = set.size(); // set 사이즈
        int maxi = len / 2; // N / 2
        int answer = Math.min(maxi, setLen);
        
        return answer;
    }
}