import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] filtered = Arrays.stream(arr)
                .filter(x -> x % divisor == 0)
                .sorted()
                .toArray();
        return filtered.length == 0 ? new int[]{-1} : filtered;
    }
}