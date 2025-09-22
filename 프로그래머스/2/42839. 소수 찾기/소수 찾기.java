import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        boolean[] used = new boolean[numbers.length()];
        dfs(numbers, "", used);

        int count = 0;
        for (int num : set) {
            if (isPrime(num)) count++;
        }
        return count;
    }

    private void dfs(String numbers, String current, boolean[] used) {
        if (!current.isEmpty()) {
            set.add(Integer.parseInt(current));
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                dfs(numbers, current + numbers.charAt(i), used);
                used[i] = false;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}