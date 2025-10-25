import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        System.out.println(my_string);
        char[] arr = my_string.toCharArray();
        System.out.println(Arrays.toString(arr));

        boolean[] mark = new boolean[my_string.length()];

        for (int i : indices) {
            mark[i] = true;
        }

        System.out.println(Arrays.toString(mark));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (!mark[i]) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}