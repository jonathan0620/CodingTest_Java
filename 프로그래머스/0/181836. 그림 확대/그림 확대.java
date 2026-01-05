import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> out = new ArrayList<>();

        for (String row : picture) {
            StringBuilder enlarged = new StringBuilder();

            for (int i = 0; i < row.length(); i++) {
                char c = row.charAt(i);
                for (int t = 0; t < k; t++) {
                    enlarged.append(c);
                }
            }

            String line = enlarged.toString();
            for (int t = 0; t < k; t++) {
                out.add(line);
            }
        }

        return out.toArray(new String[0]);
    }
}
