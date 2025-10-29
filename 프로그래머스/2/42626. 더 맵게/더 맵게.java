import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        // 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞음
        // 섞은 음식의 스코빌 지수 =
        // 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        // 섞은 횟수 return int
        // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville) {
            queue.add(s);
        }
        int count = 0;
        while (queue.size() > 1 && queue.peek() < K){
            int first = queue.poll();
            int second = queue.poll();
            int mixed = first + (second * 2);
            queue.add(mixed);
            count++;
        }
        if (queue.peek() < K) {
            return -1;
        }
        return count;
    }
}