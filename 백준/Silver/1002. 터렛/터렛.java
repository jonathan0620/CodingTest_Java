import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x1 = Long.parseLong(st.nextToken());
            long y1 = Long.parseLong(st.nextToken());
            long r1 = Long.parseLong(st.nextToken());
            long x2 = Long.parseLong(st.nextToken());
            long y2 = Long.parseLong(st.nextToken());
            long r2 = Long.parseLong(st.nextToken());

            long dx = x1 - x2;
            long dy = y1 - y2;
            long d2 = dx * dx + dy * dy;           
            long rp = r1 + r2;                     
            long rm = Math.abs(r1 - r2);            
            long rp2 = rp * rp;
            long rm2 = rm * rm;

            int ans;
            if (d2 == 0) {
                ans = (r1 == r2) ? -1 : 0;      
            } else if (d2 == rp2 || d2 == rm2) {
                ans = 1;                          
            } else if (rm2 < d2 && d2 < rp2) {
                ans = 2;                        
            } else {
                ans = 0;                      
            }
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}