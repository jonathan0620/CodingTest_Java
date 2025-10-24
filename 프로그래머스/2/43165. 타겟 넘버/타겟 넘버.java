class Solution {
    public int solution(int[] numbers, int target) {
        int[] count = new int[1];
        dfs(0, 0, numbers, target, count);
        return count[0];
    }

    private void dfs(int index, int sum, int[] numbers, int target, int[] count) {
        if (index == numbers.length) {
            if (sum == target) {
                count[0]++;
            }
            return;
        }

        dfs(index + 1, sum + numbers[index], numbers, target, count);
        dfs(index + 1, sum - numbers[index], numbers, target, count);
    }
}