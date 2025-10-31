import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        // l r 중 먼저 나오는 문자열
        // l 이 먼저면 이 문자열 기준으로 왼쪽 << 리스트
        // r 이라면 문자열 기준으로 오른쪽 있는 문자열을
        // 순서대로 담은 리스트를 return
        String[] result = {};
        for (int i = 0; i < str_list.length; i++) {
            String s = str_list[i];
            if (s.equals("l")) {
                result = Arrays.copyOfRange(str_list, 0, i);
                break;
            } else if (s.equals("r")) {
                result = Arrays.copyOfRange(str_list, i + 1, str_list.length);
                break;
            } 
        }
        return result;
    }
}