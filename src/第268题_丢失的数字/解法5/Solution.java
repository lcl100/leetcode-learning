package 第268题_丢失的数字.解法5;

public class Solution {
    public int missingNumber(int[] nums) {
        int val=nums.length;// 初始值为[0~n]的n
        for (int i = 0; i < nums.length; i++) {
            val ^= i ^ nums[i];
        }
        return val;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0};
        System.out.println();
        System.out.println(solution.missingNumber(nums));
    }
}
/**
 * 思路：
 * 位运算：异或
 */
