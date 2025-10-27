class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n>0) {
            int r = n % 3;
            if (r == 0) {
                sb.append('4');
                n = n / 3 - 1;
            } else {
                sb.append((char) ('0' + r));
                n = n / 3;
            }
        }
        return sb.reverse().toString();
    }
}