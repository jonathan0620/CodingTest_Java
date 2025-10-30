import java.util.*;
class Solution {
    public int solution(String my_string) {
        // my_string이 매개변수로 주어짐
        // 수식 계산 값 return int 
        String[] s = my_string.split(" ");
        int result = Integer.parseInt(s[0]); 
        for (int i = 1; i < s.length; i += 2) {
            String op = s[i];
            int num = Integer.parseInt(s[i + 1]);

            if (op.equals("+")) {
                result += num;
            } else if (op.equals("-")) {
                result -= num;
            }
        }
        
        return result;
    }
}