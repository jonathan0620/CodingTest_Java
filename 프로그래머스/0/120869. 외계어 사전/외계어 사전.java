import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String spellKey = String.join("", spell);

        for (String word : dic) {

            if (word.length() != spellKey.length()) continue;

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (sortedWord.equals(spellKey)) {
                return 1;
            }
        }
        return 2;
    }
}