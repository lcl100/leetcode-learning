package 第41题_缺失的第一个正数.解法3;

/**
 * @author lcl100
 * @create 2021-09-11 21:38
 */
class Solution {

    /**
     * <p>思路：数组中每个元素都可以存放到新数组中对应下标位置中，循环新数组，如果新数组中有元素值为0则表示该元素缺失，对应的下标就是缺失的值。</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，创建长度为数组长度加1的数组，将数组中每个数放到新数组对应的下标位置中，而负数和大于等于数组长度的数抛弃掉</li>
     *     <li>第二步，遍历新数组，如果某个位置的值为0则表示该处值缺失，即对应的下标就是缺失的值</li>
     * </ul>
     * <p>结果：成功（但不满足常数级别的额外空间）</p>
     * <ul>
     *     <li>执行用时:2 ms ，在所有Java提交中击败了91.00%的用户</li>
     *     <li>内存消耗:92.4 MB ，在所有Java提交中击败了73.12%的用户</li>
     *     <li>通i过测试用例:171/ 171</li>
     * </ul>
     *
     * @param nums 未排序的整数数组
     * @return 数组中没有出现的最小的正整数
     */
    public int firstMissingPositive(int[] nums) {
        // 第一步，创建长度为数组长度加1的数组，将数组中每个数放到新数组对应的下标位置中，而负数和大于等于数组长度的数抛弃掉
        int[] newNums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 || (nums[i] >= nums.length && nums[i] != nums.length)) {
                continue;
            } else {
                newNums[nums[i]] = nums[i];
            }
        }
        // 第二步，遍历新数组，如果某个位置的值为0则表示该处值缺失，即对应的下标就是缺失的值
        for (int i = 1; i < newNums.length; i++) {
            if (newNums[i] == 0) {
                return i;
            }
        }
        return nums.length + 1;
    }
}