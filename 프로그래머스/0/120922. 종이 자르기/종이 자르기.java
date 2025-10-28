class Solution {
    public int solution(int M, int N) {
        // 크기 M * N의 종이를 최소로 가위질 해야하는 횟수 return
        // 한 번에 여러 겹을 동시에 자를 수 없음
        // 한 번에 한 장
        // 딱 한 조각만 선택해서 두 조각 만든다 ( 조각수 + 1)
        // 모든 칸이 1x1이 될 때 까지 자름
        
        // 처음에는 종이가 1장
        // 자를 때 마다 조각 수는 1 증가함.
        
        int totalPieces = M * N;
        
        int result = totalPieces - 1;
        
        return result;
        
    }
}