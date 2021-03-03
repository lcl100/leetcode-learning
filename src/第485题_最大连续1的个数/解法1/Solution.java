package 第485题_最大连续1的个数.解法1;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;// 计数器，用来记录最大连续1的个数，初始为0
        int oneNum = 0;// 计数器，用来记录连续1的个数，初始为0个
        for (int num : nums) {// 循环遍历数组
            if (num == 1) {// 判断元素是否为1
                oneNum++;// 如果是，则oneNum++
            } else {// 如果不是1，而是0，那么保存当前连续1的个数，并将oneNum计数器置为0，准备下一轮计数
                if (oneNum > count) {// 保存最大值，如果已有的连续1个数比较大，则不用改变
                    count = oneNum;
                }
                oneNum = 0;
            }
        }
        return oneNum > count ? oneNum : count;// 返回大的哪个，是因为如果遇到[1,1,0,1,1,1]这样的输入，最后一个不为0，那么else就不会得到执行，那么count就不会拿到最新的oneNum值
    }
}
/**
 * 思路：
 * 设置两个计数器count和oneNum，其中count用来记录最大连续1的个数，而oneNum用来记录连续1的个数
 * 循环判断数组中的每个元素是否等于1，如果等于1则oneNum加1，如果非1（即为0的情况），那么对比count和oneNum的值然后保存最大的哪个，并将oneNum置为0，重新计数
 */