import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] digits = String.valueOf(n).split("");
        
        Arrays.sort(digits);
        
        StringBuilder sb = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            sb.append(digits[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}