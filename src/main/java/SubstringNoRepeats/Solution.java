package SubstringNoRepeats;


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder best = new StringBuilder();
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (current.indexOf(ch.toString()) != -1) {
                current = new StringBuilder();
            }
            current.append(ch);
            if (current.length() > best.length()) {
                best = current;
            }
            System.out.println(ch + " " + current + " " + best);
        }

        int startIndex = s.indexOf(best.toString());
        while (startIndex != 0 && best.indexOf(String.valueOf(s.charAt(s.indexOf(best.toString()) - 1))) == -1) {
            best.insert(0, s.charAt(s.indexOf(best.toString()) - 1));
            startIndex = s.indexOf(best.toString());
        }

        return best.length();
    }
}
