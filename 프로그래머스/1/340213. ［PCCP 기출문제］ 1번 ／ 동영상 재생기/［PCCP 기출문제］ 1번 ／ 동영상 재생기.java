import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int V = toSec(video_len);
        int p = toSec(pos);
        int S = toSec(op_start);
        int E = toSec(op_end);

        p = skipOpening(p, S, E);

        for (String cmd : commands) {
            if ("prev".equals(cmd)) {
                p = Math.max(0, p - 10);
            } else {
                p = Math.min(V, p + 10);
            }
            p = skipOpening(p, S, E);
        }
        return toTime(p);
    }

    private int skipOpening(int t, int s, int e) {
        return (t >= s && t < e) ? e : t;
    }

    private int toSec(String mmss) {
        String[] sp = mmss.split(":");
        return Integer.parseInt(sp[0]) * 60 + Integer.parseInt(sp[1]);
    }

    private String toTime(int sec) {
        int m = sec / 60, s = sec % 60;
        return String.format("%02d:%02d", m, s);
    }
}