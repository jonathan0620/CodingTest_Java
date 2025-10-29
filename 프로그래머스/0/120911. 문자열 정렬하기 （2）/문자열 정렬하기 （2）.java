import java.util.*;
class Solution {
    public String solution(String my_string) {
        // myString - 대소문자로 이루어짐
        // 이걸 소문자로 바꾸고
        // 알파벳 순서대로 정렬
        
        String lower = my_string.toLowerCase(); // 이걸 소문자로 바꾸기
        
        char[] arr = lower.toCharArray(); // 문자 배열
        
        Arrays.sort(arr);
        
        String answer = new String(arr);
        return answer;
    }
}