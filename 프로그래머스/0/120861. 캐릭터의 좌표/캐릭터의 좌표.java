import java.util.*;
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int height = board[0] / 2;
        int width = board[1] / 2;
        
        int x = 0, y = 0;
        
        for (String key : keyinput) {
            int nx = x, ny = y;
            
            if ("left".equals(key)) nx = x - 1;
            else if ("right".equals(key)) nx = x + 1;
            else if ("up".equals(key)) ny = y + 1;
            else if ("down".equals(key)) ny = y - 1;
            
            if (Math.abs(nx) <= height && Math.abs(ny) <= width) {
                x = nx;
                y = ny;
            }
        }
        
        return new int[]{x, y};
    }
}