import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> q = new ArrayDeque<>();
        int[] freq = new int[10];

        for (int i = 0; i < priorities.length; i++) {
            int p = priorities[i];
            q.offerLast(new int[]{i, p});
            freq[p]++;
        }

        int currentMax = 9;
        while (currentMax > 0 && freq[currentMax] == 0) currentMax--;

        int order = 0;

        while (!q.isEmpty()) {
            int[] cur = q.pollFirst();
            int idx = cur[0];
            int pri = cur[1];

            if (pri == currentMax) {
                order++;
                freq[pri]--;

                if (idx == location) return order;

                if (freq[currentMax] == 0) {
                    while (currentMax > 0 && freq[currentMax] == 0) currentMax--;
                }
            } else {
                q.offerLast(cur);
            }
        }

        return -1;
    }
}