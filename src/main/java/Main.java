import SubstringNoRepeats.Solution;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "1R1T7";
        int sol = solution.lengthOfLongestSubstring(input);
        System.out.println(sol);
    }
}
