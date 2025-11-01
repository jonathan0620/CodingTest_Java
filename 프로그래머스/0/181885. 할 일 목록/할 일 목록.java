import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 할일 문자열 배열 todo_list
        // 각각의 일을 마쳤는지 finished
        //마치지 못한 일들을 순서대로 담은 배열 return String[]
        List<String> list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}