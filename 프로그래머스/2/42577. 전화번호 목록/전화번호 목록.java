import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 다른 번호의 접두어 인가?
        // 전화번호 북 phone_book
        
        Arrays.sort(phone_book); // 사전 순 정렬
        
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
}