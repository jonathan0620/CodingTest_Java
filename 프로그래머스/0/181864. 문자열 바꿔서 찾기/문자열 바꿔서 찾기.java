class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'A') sb.append('B');
            else sb.append('A');
        }

        String swapped = sb.toString();

        return swapped.contains(pat) ? 1 : 0;
    }
}