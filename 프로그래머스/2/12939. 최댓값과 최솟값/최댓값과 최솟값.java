class Solution {
    public String solution(String s) {
      
        String[] parts = s.split(" ");
     
        int[] numbers = new int[parts.length];
        
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
    
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min ) min = numbers[i];
            if (numbers[i] > max ) max = numbers[i];
        }
     
        return min + " " + max;
    }
}