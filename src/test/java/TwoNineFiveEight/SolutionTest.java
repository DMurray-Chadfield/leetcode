package TwoNineFiveEight;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @ParameterizedTest
    @CsvSource(delimiter = ';', value = {
            "[1,2,3,1,2,3,1,2]; 2; 6",
            "[1,2,1,2,1,2,1,2]; 1; 2",
            "[5,5,5,5,5,5,5]; 4; 4",
            "[1]; 1; 1"

    })
    void testReturnsCorrectValue(@ConvertWith(IntArrayConverter.class) int[] nums, int k, int expected) {
        Solution underTest = new Solution();

        int output = underTest.maxSubarrayLength(nums, k);

        assertEquals(expected, output);
    }
}
