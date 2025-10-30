import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // s 문자열
        // 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return !
        // 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return
        
        String[] str = s.split("");
        
        Arrays.sort(str); // 한번씩 등장한 문자를 사전 순 정렬
        
        String answer = "";
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            if (count == 1) {
                answer += str[i];
            }
        }
        
        return answer;
    }
}