import TwoNineFiveEight.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {1,2 , 4, 5, 3, 1, 4};
        int sol = solution.maxSubarrayLength(nums, 2);
        System.out.println(sol);
    }
}
