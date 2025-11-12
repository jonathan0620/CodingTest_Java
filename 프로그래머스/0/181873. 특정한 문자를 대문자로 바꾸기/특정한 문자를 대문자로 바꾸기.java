class Solution {
    public String solution(String my_string, String alp) {
        // alp에 해당하는 문자를 모두 대문자 처리함
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c == alp.charAt(0)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
         }
        
        return sb.toString();
    }
}