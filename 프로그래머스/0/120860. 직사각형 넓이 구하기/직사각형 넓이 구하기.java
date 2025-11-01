class Solution {
    public int solution(int[][] dots) {
        // 직사각형의 넓이를 return int
        // dots 길이 4
        // dots의 원소의 길이 2
        int maxX = Integer.MIN_VALUE; 
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        for (int i = 0; i < dots.length; i++) {
            maxX = Math.max(maxX, dots[i][0]);
            minX = Math.min(minX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
            minY = Math.min(minY, dots[i][1]);
        }
        int width = maxX - minX;
        int height = maxY - minY;
        int answer = width * height;
        return answer;
    }
}