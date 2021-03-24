package LCP第06题_拿硬币.解法4;

public class Solution {
    public int minCount(int[] coins) {
        int[] nums = new int[6];
        for (int coin : coins) {
            nums[coin % 2 + coin / 2]++;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += i * nums[i];
        }
        return count;
    }
}
/*
    解题思路：
        0.一个萝卜一个坑
        1.因为题目限制了coins[i]的范围，所以coins[i]拿完的次数范围也限定了：[1,5]，所以设定一个数组长度为6的数组
        2.将这些值放到指定位置的坑中，其实是次数加1，但它们的索引是对应的
        3.最后将索引乘以次数相加得到的总和，返回即可
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：35.7 MB, 在所有 Java 提交中击败了55.87% 的用户
 */