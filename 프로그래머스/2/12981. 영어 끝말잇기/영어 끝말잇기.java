import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> set = new HashSet<>();
        //1. 몇번째 친구가 했는지 - 나머지
        //2. 몇번째 차례에서 했는지
        for (int i = 0; i<words.length; i++) { // 총 게임 횟수
            String cur = words[i];
            if (set.contains(cur)) {
               int player = (i % n) + 1;
               int round = (i / n) + 1;
               return new int[]{player, round};
        }
        
            if (i > 0) {
                String prev = words[i - 1];
                char lastChar = prev.charAt(prev.length() - 1);
                char firstChar = cur.charAt(0);

                if (lastChar != firstChar) {
                    int player = (i % n) + 1;
                    int round = (i / n) + 1;
                    return new int[]{player, round};
                }
            }

            set.add(cur);
        }
        return new int[]{0, 0};
    }
}