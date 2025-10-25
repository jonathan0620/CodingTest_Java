import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();
        int i = 0;
        int len = arr.length;
        
        while (i < len) {
            int cur = arr[i];
            if (list.isEmpty()) {
                list.add(cur);
                i++;
                continue;
            }
            int top = list.get(list.size() - 1);
            if (top < cur) {
                list.add(cur);
                i++;
            } else {
                list.remove(list.size() - 1);
            }
        }
        
        int answer[] = new int[list.size()];
        for (int j = 0; j <list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}