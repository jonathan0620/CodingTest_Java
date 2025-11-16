import java.util.*;

class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> answer = new ArrayList<>();

        String[] arr = myString.split("x", -1); 

        for (String s : arr) {
            answer.add(s.length());
        }
        
        return answer;
    }
}