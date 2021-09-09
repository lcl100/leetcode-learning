package 第1991题_找出数组的中间位置.解法1;

/**
 * @author lcl100
 * @create 2021-09-09 22:25
 */
class Solution {
    /**
     * <p>思路：求下标i之前所有元素（不包括i）的和，以及下标i之后所有元素（不包括i）的和，比较二者是否相等，如果相等则表示i是中间位置，则返回i。如果所有都不能匹配则返回-1。</p>
     * <p>结果：</p>
     * <ul>
     *     <li>执行用时：1 ms, 在所有 Java 提交中击败了76.91% 的用户</li>
     *     <li>内存消耗：37.8 MB, 在所有 Java 提交中击败了41.47% 的用户</li>
     *     <li>通过测试用例：294 / 294</li>
     * </ul>
     *
     * @param nums 整数数组
     * @return 数组的中间位置
     */
    public int findMiddleIndex(int[] nums) {
        // 循环遍历数组中所有元素
        for (int i = 0; i < nums.length; i++) {
            // 计算下标i之前和之后所有元素的总和
            int before = beforeSum(nums, i);
            int after = afterSum(nums, i);
            // 如果相等则返回i
            if (before == after) {
                return i;
            }
        }
        return -1;
    }

    /**
     * <p>计算nums数组种index下标之前（不包括index）所有元素的总和。</p>
     *
     * @param nums  整数数组
     * @param index 指定下标
     * @return index下标之前所有元素的总和
     */
    public int beforeSum(int[] nums, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += nums[i];
        }
        return sum;
    }

    /**
     * <p>计算nums数组种index下标之后（不包括index）所有元素的总和。</p>
     *
     * @param nums  整数数组
     * @param index 指定下标
     * @return index下标之后所有元素的总和
     */
    public int afterSum(int[] nums, int index) {
        int sum = 0;
        for (int i = index + 1; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}