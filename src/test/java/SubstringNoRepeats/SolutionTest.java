package SubstringNoRepeats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @ParameterizedTest
    @CsvSource(delimiter = ';', value = {
            "abcabcbb; 3",
            "bbbbb; 1",
            "pwwkew; 3",
            "1R1T7; 4",
            "mjvhmi; 5"
    })
    void testReturnsCorrectValue(String input, int expected) {
        Solution underTest = new Solution();

        int output = underTest.lengthOfLongestSubstring(input);

        assertEquals(expected, output);
    }
}
