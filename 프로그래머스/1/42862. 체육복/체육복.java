import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 체육복 도난, 여벌 체육복 빌릴 수 있음
        // 번호는 체격순, 앞 번호 나 뒷 번호 학생에게만 빌려줄 수 있음
        // 체육복을 적절히 빌려서 많은 학생이 체육 수업 들어야 함
        // 전체 학생수 n
        // 체육복 도난당한 학생 수 lost 
        // 여벌의 체육복 가져온 학생 수 reserve
        // 체육 수업을 들을 수 있는 학생의 최댓값 return int
        
        // 전체 학생수 2 < ~ < 30
        // 도난 1 <= n
        // 중복되는 번호는 없음
        // 여벌 체육복이 있는 학생만 다른 학생에게 빌려줄 수 있음

        boolean[] usedReserve = new boolean[reserve.length];
        boolean[] usedLost = new boolean[lost.length];
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (!usedReserve[j] && lost[i] == reserve[j]) {
                    usedLost[i] = true;
                    usedReserve[j] = true;
                    break;
                }
            }
        }

        int[] cnt = new int[n + 1]; 

        for (int i = 0; i < lost.length; i++) {
            if (!usedLost[i]) {
                cnt[lost[i]]--;
            }
        }
        for (int j = 0; j < reserve.length; j++) {
            if (!usedReserve[j]) {
                cnt[reserve[j]]++;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (cnt[i] == -1) {
                if (i - 1 >= 1 && cnt[i - 1] == 1) {
                    cnt[i - 1] = 0;
                    cnt[i] = 0;
                } else if (i + 1 <= n && cnt[i + 1] == 1) {
                    cnt[i + 1] = 0;
                    cnt[i] = 0;
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (cnt[i] >= 0) answer++;
        }
        return answer;
    }
}
