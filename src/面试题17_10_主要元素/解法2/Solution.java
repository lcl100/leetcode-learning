package 面试题17_10_主要元素.解法2;

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        // 1.对数组排序
        Arrays.sort(nums);
        // 2.两根指针
        int slow = 0;// 慢指针，记录每个数的起始索引
        int fast = 0;// 快指针，记录每个数的结束索引，如[1,2,2,3]那么2的起始索引是1，结束索引是3
        int count = 0;// 计数器，记录每个数的出现次数
        int len = nums.length;
        while (fast < len) {
            // 如果是相同的数
            if (nums[fast] == nums[slow]) {
                // 那么计数器加1
                count++;
                // fast指针前进一步，继续比较
                fast++;
            } else {
                // 表示不是相同的数，那么计算该数的出现次数
                count = fast - slow;
                // 判断该数是否是主要元素，如果是则返回
                if (count > len / 2) {
                    return nums[slow];
                }
                // 如果该数不是主要元素，那么重置slow和count
                slow = fast;
                count = 0;
            }
        }
        // 处理边界情况
        if (fast == len && count > len / 2) {
            return nums[slow];
        }
        return -1;
    }
}
/*
    解题思路：
        0.快慢指针
        1.先对数组进行排序，才能统计连续出现的元素
        2.用两根指针来记录每个元素的出现次数
 */