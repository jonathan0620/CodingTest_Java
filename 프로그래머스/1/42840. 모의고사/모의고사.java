import java.util.*;

class Solution {
    private static final int[] P1 = {1, 2, 3, 4, 5};
    private static final int[] P2 = {2, 1, 2, 3, 2, 4, 2, 5};
    private static final int[] P3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {
        int s1 = score(answers, P1);
        int s2 = score(answers, P2);
        int s3 = score(answers, P3);

        int max = Math.max(s1, Math.max(s2, s3));

        List<Integer> list = new ArrayList<>();
        if (s1 == max) list.add(1);
        if (s2 == max) list.add(2);
        if (s3 == max) list.add(3);

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }

    private int score(int[] answers, int[] pattern) {
        int cnt = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern[i % pattern.length]) cnt++;
        }
        return cnt;
    }
}