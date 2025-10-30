import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        // 문자열 my_str
        // n 씩 자름
        // 그 배열 리턴
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_str.length(); i+=n) {
            list.add(my_str.substring(i, Math.min(i + n, my_str.length())));
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}