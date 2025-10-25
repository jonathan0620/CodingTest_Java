import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for (String str : intStrs) {
            String slice = str.substring(s, s + l);
            int val = Integer.parseInt(slice);
            if (val > k) {
                list.add(val);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}