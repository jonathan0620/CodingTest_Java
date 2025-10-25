class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int idx = 0;
        int len = arr.length;
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (str.isEmpty()) {
                str += arr[i];
            } else {
                if (str.charAt(str.length() - 1) - '0' == arr[i]) {
                    str = str.substring(0, str.length() - 1);
                } else {
                    str += arr[i];
                }
            }
        }
        System.out.println(str);
        if (str.isEmpty())
            return new int[]{-1};
        else {
            char[] ch = str.toCharArray();
            answer = new int[str.length()];
            for (int i = 0; i < ch.length; i ++) {
                answer[i] = ch[i] - '0';
            }
        }
       return answer;
    }
}