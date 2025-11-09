class Solution {
    public int solution(String my_string) {
        int sum = 0;
        String num = "";

        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                num += c;
            } else {
                if (!num.equals("")) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        if (!num.equals("")) sum += Integer.parseInt(num);
        return sum;
    }
}