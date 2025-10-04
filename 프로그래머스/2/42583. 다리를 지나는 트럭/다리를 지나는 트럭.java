import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new ArrayDeque<>();
        for (int i = 0; i < bridge_length; i++) bridge.offer(0);

        int time = 0, idx = 0, onBridge = 0;

        while (idx < truck_weights.length) {
            time++;
            onBridge -= bridge.poll();

            int next = truck_weights[idx];
            if (onBridge + next <= weight) {
                bridge.offer(next);
                onBridge += next;
                idx++;
            } else {
                bridge.offer(0);
            }
        }
        return time + bridge_length;
    }
}