import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String num = String.valueOf(i);
            boolean valid = true;
            
            for (char c : num.toCharArray()) {
                if (c != '0' && c != '5') {
                    valid = false;
                    break;
                }
            }
            if(valid) list.add(i);
        }
        if (list.isEmpty()) return new int[]{-1};
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}