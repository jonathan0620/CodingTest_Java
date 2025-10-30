class Solution {
    public long solution(String numbers) {
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String s = numbers;
        for (int i = 0; i < 10; i++) {
            s = s.replace(words[i], String.valueOf(i));
        }
        long answer = 0;
        return Long.parseLong(s);
    }
}