class Solution {
    public String[] solution(String[] names) {
        // 줄 서 있는 사람 names
        // 앞에서 다섯 명 씩 묶어서 가장 앞에 써 있는 사람 return
        // 5명이 안 돼도 가장 앞 사람 이름 return String[]
        String[] answer = new String[(names.length+4) / 5];
        int idx = 0;
        for (int i = 0; i < names.length; i+=5) {
            answer[idx++] = names[i];
        }
        return answer;
    }
}