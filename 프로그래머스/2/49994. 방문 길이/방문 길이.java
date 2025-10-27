import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<Integer> set = new HashSet<>();
        int x = 0, y = 0;

        for (char c : dirs.toCharArray()) {
            int nx = x, ny = y;

            if (c == 'U') ny++;
            else if (c == 'D') ny--;
            else if (c == 'R') nx++;
            else if (c == 'L') nx--;

            if (nx < -5 || nx > 5 || ny < -5 || ny > 5) continue;

            int start = (x + 5) * 11 + (y + 5);
            int end   = (nx + 5) * 11 + (ny + 5);

            int path = (start < end)
                    ? start * 121 + end
                    : end * 121 + start;

            set.add(path); 

            x = nx;
            y = ny;
        }

        return set.size();
    }
}