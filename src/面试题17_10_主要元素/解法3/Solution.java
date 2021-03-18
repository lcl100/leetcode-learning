package 面试题17_10_主要元素.解法3;

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        // 1.排序
        Arrays.sort(nums);
        // 2.获取中间元素
        int middle = nums[nums.length / 2];
        // 3.循环遍历数组然后统计middle元素的出现次数
        int count = 0;// 记录middle元素在nums数组中的出现次数
        for (int num : nums) {
            if (middle == num) {
                count++;
            }
        }
        // 4.判断middle是否是主要元素
        return count > nums.length / 2 ? middle : -1;
    }
}
/*
    解题思路：
        1.先对数组排序，然后获取到数组的中间元素
        2.然后统计中间元素的出现次数，如果中间元素的出现次数大于数组长度的二分之一，那么该元素就是主要元素，否则返回-1
 */
