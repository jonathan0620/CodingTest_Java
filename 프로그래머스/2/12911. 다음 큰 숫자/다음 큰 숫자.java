class Solution {
    public int solution(int n) {
        String nBin = Integer.toBinaryString(n);
        int nOnes = nBin.replace("0", "").length();
        
        int next = n;
        while(true) {
            next++;
            if (next > n) {
                String nextBin = Integer.toBinaryString(next);
                int nextOnes = nextBin.replace("0", "").length();
                if (nextOnes == nOnes) {
                    return next;
                }
            }
        }
    }
}