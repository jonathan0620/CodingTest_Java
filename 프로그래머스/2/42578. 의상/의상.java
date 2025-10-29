import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 종류별로 최대 1가지 의상만 착용 가능
        // 서로 다른 옷의 조합 수 return (int)
        // ["yellow_hat", "headgear"], 
        // ["blue_sunglasses", "eyewear"], 
        // ["green_turban", "headgear"]
        
        Map<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        System.out.println(map);
        
        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1);
        }
        return answer - 1;
    }
}