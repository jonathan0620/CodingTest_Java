import java.util.*;

class Solution {
    public int solution(String s) {
        // 문자열에 있는 숫자를 차례대로 더함
        // "Z"가 나오면 바로 전에 더했던 숫자를 뺌
        // 값 Int를 return
        
        // 스트링으로 되어있고 여기서 숫자로 바꿔야 할텐데,
        // Z는 문자열인데 이걸 숫자로 바꾸면 안 될 것 같은데 어떻게 구하지?
        // 일단 Z를 만나는 인덱스를 구해서 그 앞은 숫자로 변경한다?
        // 그 뒤도 숫자로 변경해야하는데 Integer.parseInt(c) 이렇게 하나하나?
       
        // 아 stack으로 진행?
        // 스택으로 넣고 Z 만나면 그 앞에 원소 하나 빼기
        
        Stack<Integer> stk = new Stack<>();
        for (String token : s.split(" ")) {
            if (token.equals("Z")) {
                if (!stk.isEmpty()) stk.pop();
            } else {
                stk.push(Integer.parseInt(token));
            }
        }
        int result = 0;
        for (int i = 0; i < stk.size(); i++) {
            result += stk.get(i);
        }
        
        // for (int v : stk) result += v;

        return result;
    }
}