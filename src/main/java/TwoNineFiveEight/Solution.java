package TwoNineFiveEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        List<Integer> numsList = Arrays.stream(nums).boxed().toList();

        int numsArraySize = numsList.size();
        int maxSubArrayLength = 0;

        outer:
            for (int subArraySize = numsArraySize; subArraySize >= 1; subArraySize--) {
                for (int startIndex = numsArraySize - subArraySize; startIndex >= 0; startIndex--) {
                    List<Integer> candidateSubArray = numsList.subList(startIndex, startIndex + subArraySize);
                    if (candidateIsValid(candidateSubArray, k)) {
                        maxSubArrayLength = candidateSubArray.size();
                        break outer;
                    }
                }
            }

        return maxSubArrayLength;
    }

    private boolean candidateIsValid(List<Integer> candidateSubArray, int maxElementFrequency) {
        List<Integer> uniqueElements = getUniqueElements(candidateSubArray);
        boolean isValid = true;
        for (Integer uniqueElement : uniqueElements) {
            if (computeOccurrencesOf(uniqueElement, candidateSubArray) > maxElementFrequency) {
                isValid = false;
            }
        }
        return isValid;
    }

    private List<Integer> getUniqueElements(List<Integer> candidateSubArray) {
        List<Integer> uniqueElements = new ArrayList<>();
        for (Integer element : candidateSubArray) {
            if (uniqueElements.contains(element)) {
                continue;
            }
            uniqueElements.add(element);
        }
        return uniqueElements;
    }

    private int computeOccurrencesOf(Integer element, List<Integer> candidateSubArray) {
        int count = 0;
        for (int i = candidateSubArray.size() - 1; i >= 0; i--) {
            if (candidateSubArray.get(i).equals(element)) {
                count++;
            }
        }
        return count;
    }
}
