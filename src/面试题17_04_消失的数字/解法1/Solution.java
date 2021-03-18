package 面试题17_04_消失的数字.解法1;

class Solution {
    public int missingNumber(int[] nums) {
        // 循环遍历[0,n]进行比较
        for (int i = 0; i <= nums.length; i++) {
            int count = 0;// 计数器，记录i!=num的次数
            for (int num : nums) {// 循环遍历nums数组中的元素
                if (i == num) {// 如果相等，表示不是消失的数字
                    break;// 直接跳出循环
                } else {// 如果不相等，则记录不相等的次数
                    count++;
                }
            }
            // 如果不相等的次数等于数组nums的长度，那么表示该数至始至终没有出现过，就是消失的数字
            if (count == nums.length) {
                return i;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.暴力破解
        1.双层for循环判断某个数字是否出现
 */