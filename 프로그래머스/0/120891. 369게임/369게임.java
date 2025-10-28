class Solution {
    public int solution(int order) {
        // 머쓱이가 말해야하는 숫자 order
        // 3, 6, 9가 있으면 박수 + 1
        String str = String.valueOf(order);
        int count = 0; // 박수치는 횟수
        
        // 돌면서 3 있으면 + 1 6 있으면 + 1 9 있으면 + 1?
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '3' || c == '6' || c == '9') {
                count++;
            }
        }
        
        return count;
    }
}