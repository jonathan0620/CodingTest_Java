import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // 단 한 명의 선수를 제외하고 완주
        // participant 참가자
        // completion 완주자
        // return 완주하지 못한 선수
        // 동명이인 있을 수 있음
        
        // getOrDefalut(p, 0) -> 있으면 p 반환 없으면 0 반환
        
        // HashMap !! Key-Value 해보자
        
        Map<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);   
        }
        
        for (String c : completion) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (String k : map.keySet()) {
            if (map.get(k) != 0) {
                return k;
            }
        }
        
        
        return "";
    }
}