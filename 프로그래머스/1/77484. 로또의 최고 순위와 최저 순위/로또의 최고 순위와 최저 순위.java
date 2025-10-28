import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        
        int zero = 0;
        int count = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
            if (lottos[i] == 0) {
                zero++;
            }
        }
        int best = count + zero;
        int worst = count;
        int max = 0;
        int min = 0;
        if (best == 6) {
            max = 1;
        } else if (best == 5) {
            max = 2;
        } else if (best == 4) {
            max = 3;
        } else if (best == 3) {
            max = 4;
        } else if (best == 2) {
            max = 5;
        } else {
            max = 6;
        }
        
        if (worst == 6) {
            min = 1;
        } else if (worst == 5) {
            min = 2;
        } else if (worst == 4) {
            min = 3;
        } else if (worst == 3) {
            min = 4;
        } else if (worst == 2) {
            min = 5;
        } else {
            min = 6;
        }
        // 음 일단 둘 다 순서대로 정렬해서 점수가 맞는지 확인하고
        // 맞으면 count++? 최저 최고니까 min max?
        // 근데 여기서 0이 있으면... 최고 최저가 나올 수 있음..!
        // 근데 여기서 min max를 어떻게 분류하지?
        // 만약 입출력1 처럼 같은 번호가 2개고 나머지는 다 다르지만 0이 2개면 4개 더 맞아서 최고 3등 최저 5등
        
        // 최저는 실제로 지금 맞춘 갯수
        // 최고는 지금 맛춘 갯수 + 0의 갯수
        
        // 여기서 .. 리스트에서 똑같은 값을 빼고 그 값이 0의 갯수 뭐 이렇게 봐야하나??
        // 0의 갯수가 아 이건 너무 어려울거 같은데 어떻게 해야하지?
        
        // 알아볼 수 없는 번호는 0 - 내 로또 Lottos
        // 당첨 번호 win_nums
        // 순서 상관 없이 로또 당첨
        // 당첨 가능한 최고 순위와 최저 순위를 배열로 return
        return new int[]{max, min};
    }
}