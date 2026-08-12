import TwoNineFiveEight.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int sol = solution.maxSubarrayLength(new int[] {1,2,3,1,2,3,1,2}, 2);
        System.out.println(sol);
    }
}
