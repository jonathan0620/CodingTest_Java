class Solution {
    public int[] solution(String s) {
        int transformCount = 0;
        int removedZeroCount = 0;

        while (!s.equals("1")) {
            String removed = s.replace("0", "");
            int zeros = s.length() - removed.length();
            removedZeroCount += zeros;

            int lenAfter = removed.length();
            s = Integer.toBinaryString(lenAfter);

            transformCount++;
        }

        return new int[]{transformCount, removedZeroCount};
    }
}