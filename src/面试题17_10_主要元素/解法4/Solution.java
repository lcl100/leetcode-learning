package 面试题17_10_主要元素.解法4;

class Solution {
    public int majorityElement(int[] nums) {
        // 1.使用摩尔投票法得到剩下的元素
        int count = 1;// 计数器，记录当前剩下的元素
        int temp = nums[0];// 表示要投票的元素，初始为第一个元素
        for (int num : nums) {
            if (num == temp) {// 如果当前元素num与temp相同
                count++;// 那么加1
            } else {
                count--;// 如果不同则减去1
                if (count == 0) {// 注意：如果减到了0，那么表示当前元素的个数不满足要求
                    count = 1;// 就重置count和temp
                    temp = num;
                }
            }
        }
        // 2.最后需要判断剩下的数是否是主要元素
        int c = 0;
        for (int num : nums) {
            if (num == temp) {
                c++;
            }
        }
        return c > nums.length / 2 ? temp : -1;
    }
}
/*
    解题思路：
        0.摩尔投票法
        1.通过摩尔投票法得到剩下的数
        2.验证得到的数是否是主要元素
 */