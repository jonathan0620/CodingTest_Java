import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] ans = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] t = quiz[i].split(" ");

            int A = Integer.parseInt(t[0]);
            String op = t[1];
            int B = Integer.parseInt(t[2]);
            int C = Integer.parseInt(t[4]);

            int left = op.equals("+") ? (A + B) : (A - B);
            ans[i] = (left == C) ? "O" : "X";
            
        }
        return ans;
    }
}