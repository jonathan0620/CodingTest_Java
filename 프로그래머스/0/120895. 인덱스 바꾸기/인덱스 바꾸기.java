import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        // num1, num2 인덱스
        // my_string 문자열
        
        // 인덱스 처리하기 위해 배열로 변경
        String[] str = my_string.split("");
        String idx = str[num1];
        str[num1] = str[num2];
        str[num2] = idx;
        
        String answer = String.join("", str);
        
        return answer;
    }
}