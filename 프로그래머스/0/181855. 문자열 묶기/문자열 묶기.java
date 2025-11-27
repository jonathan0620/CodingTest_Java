class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];

        for (String s : strArr) {
            int len = s.length();
            count[len]++;
        }

        int max = 0;
        for (int i = 1; i <= 30; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        return max;
    }
}