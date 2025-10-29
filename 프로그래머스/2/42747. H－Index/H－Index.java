import java.util.*;

class Solution {
    public int solution(int[] citations) {
        // n 논문 
        // h번 이상 인용된 게 h편 이상
        // 논문의 인용 횟수 배열 citations
        
        Arrays.sort(citations);
        System.out.print(Arrays.toString(citations));
        
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int answer = n - i;
            if (citations[i] >= answer) {
                return answer;
            }
        }
        
        return 0;
    }
}