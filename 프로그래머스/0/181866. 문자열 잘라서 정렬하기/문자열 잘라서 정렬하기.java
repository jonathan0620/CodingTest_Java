import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> answer = new ArrayList<>();

        String[] arr = myString.split("x"); 

        for (String s : arr) {
            if (!s.isEmpty()) {
                answer.add(s);
            }
        }
        
        Collections.sort(answer);

        return answer.toArray(new String[0]);
    }
}