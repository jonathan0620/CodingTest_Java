import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int days = (int) Math.ceil((double) remain / speeds[i]);
            q.offer(days);
        }

        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            int current = q.poll();
            int count = 1;
            
            while (!q.isEmpty() && q.peek() <= current) {
                q.poll();
                count++;
            }
            result.add(count);
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}