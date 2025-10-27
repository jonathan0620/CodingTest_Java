class Solution {
    public int solution(int n) {
        int fact = 1;
        int i = 1;

        while (fact * (i + 1) <= n) {
            i++;
            fact *= i;
        }

        return i;
    }
}