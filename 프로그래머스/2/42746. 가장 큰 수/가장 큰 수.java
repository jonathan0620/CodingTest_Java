import java.util.*;

class Solution {
    static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        }
    }

    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, new MyComparator());

        if (arr[0].equals("0")) {
            return "0";
        }

        String result = "";
        for (String s : arr) {
            result += s;
        }

        return result;
    }
}