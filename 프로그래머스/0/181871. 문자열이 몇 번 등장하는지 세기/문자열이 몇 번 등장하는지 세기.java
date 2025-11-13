class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int index = 0;

        while (true) {
            index = myString.indexOf(pat, index);
            if (index == -1) break;
            count++;
            index = index + 1;
        }

        return count;
    }
}