package 剑指Offer第53题II_0到n减1中缺失的数字.解法7;

public class Solution {
    public int missingNumber(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            // 如果nums[mid] == mid也就是说当前元素的下标等于他自己，比如数组[0,1,2,3,4,5]
            if (nums[middle] == middle) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return start;
    }
}
/*
    解题思路：
        0.二分查找
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了23.56% 的用户
 */
