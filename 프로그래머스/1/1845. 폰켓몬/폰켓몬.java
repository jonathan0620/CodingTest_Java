import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int pick = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        return Math.min(set.size(), pick);
    }
}