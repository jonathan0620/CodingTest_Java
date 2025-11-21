import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[abc]");
        
        List<String> list = new ArrayList<>();
        
        for (String s : arr) {
            if (s.length() > 0) {
                list.add(s);
            }
        }
        
        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        
        return list.toArray(new String[0]);
    }
}