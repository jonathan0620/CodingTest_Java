class Solution {
    public int solution(int n) {
        int i = 1;
        while (true) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                i++;
                continue;
            }
            n--;
            if (n == 0) {
                return i;
            }
            i++;
        }
    }
}