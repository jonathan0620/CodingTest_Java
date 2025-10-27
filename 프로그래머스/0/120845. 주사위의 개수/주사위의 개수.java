class Solution {
    public int solution(int[] box, int n) {
        int width = box[0];
        int height = box[1];
        int high = box[2];
        
        int wCount = width / n;
        int hCount = height / n;
        int hiCount = high / n;
        
        
        int answer = wCount * hCount * hiCount;
        return answer;
    }
}