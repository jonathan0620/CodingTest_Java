import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        // ad라는 부분 문자열을 포함하고 있는 모든 문자열 제거
        // 남은 문자열을 순서 유지하여 배열로 return
        // 순서유지... list ?
        List<String> list = new ArrayList<>();
        for (String str : strArr) {
            if (str.contains("ad")) {
                continue;
            } else {
                list.add(str);
            }
        }
        String[] answer = new String[list.size()]; 
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}