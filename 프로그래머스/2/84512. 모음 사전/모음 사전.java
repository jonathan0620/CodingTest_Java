import java.util.*;

class Solution {
    public int solution(String word) {
        int[] w = {781, 156, 31, 6, 1};
        char[] dict = {'A','E','I','O','U'};
        Map<Character,Integer> idx = new HashMap<>();
        for (int i = 0; i < dict.length; i++) idx.put(dict[i], i);

        int ans = 0;
        for (int i = 0; i < word.length(); i++) {
            ans += idx.get(word.charAt(i)) * w[i] + 1;
        }
        return ans;
    }
}