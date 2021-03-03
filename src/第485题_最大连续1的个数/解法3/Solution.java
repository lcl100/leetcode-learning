package 第485题_最大连续1的个数.解法3;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // 1.将整型数组转换成一个字符串
        String str = "";
        int zeroCount = 0;// 计数器，统计0的个数
        for (int num : nums) {
            str += num;
            if (num == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == nums.length) {// 这是为了处理[0]、[0,0]这种情况的，直接返回0因为没有1，更没有连续的1
            return 0;
        }
        // 2.将字符串转换成字符串数组，根据"0"分隔开
        String[] split = str.split("0");
        int max = split[0].length();// 记录一个字符串的字符数
        for (int i1 = 1; i1 < split.length; i1++) {
            int length = split[i1].length();
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}
/**
 * 思路：
 * 处理成一个字符串，通过0将连续1作为字符串分隔开。
 * 该解法更耗时间，不过思路不错。
 */