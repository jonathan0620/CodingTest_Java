import java.util.*;

class Solution {

    public String solution(int[] numbers) {
        
        // 이어 붙여 만들 수 있는 가장 큰 수
        // str 로 변경해서 진행..?
        
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        
        String result = String.join("", arr);
        
        if (result.startsWith("0")) {
            return "0";
        }
        
        return result;
        
    }
}