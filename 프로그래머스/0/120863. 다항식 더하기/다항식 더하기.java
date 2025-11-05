class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        int xSum = 0;
        int numSum = 0;

        for (String term : terms) {
            if (term.contains("x")) {
                String coef = term.replace("x", "");
                xSum += coef.equals("") ? 1 : Integer.parseInt(coef);
            } else {
                numSum += Integer.parseInt(term);
            }
        }

        if (xSum != 0 && numSum != 0)
            return (xSum == 1 ? "x" : xSum + "x") + " + " + numSum;
        else if (xSum != 0)
            return xSum == 1 ? "x" : xSum + "x";
        else
            return String.valueOf(numSum);
    }
}