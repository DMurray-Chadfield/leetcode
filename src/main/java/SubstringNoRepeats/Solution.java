package SubstringNoRepeats;


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder best = new StringBuilder();
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (current.indexOf(ch.toString()) != -1) {
                int lastIndexOfChar = current.lastIndexOf(ch.toString());
                current = new StringBuilder(current.substring(lastIndexOfChar + 1));
            }
            current.append(ch);
            if (current.length() > best.length()) {
                best = current;
            }
        }

        return best.length();
    }
}
