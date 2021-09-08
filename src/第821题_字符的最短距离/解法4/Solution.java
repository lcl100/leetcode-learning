package 第821题_字符的最短距离.解法4;

/**
 * @author lcl100
 * @create 2021-09-08 22:02
 */
public class Solution {
    /**
     * <p>思路：把字符c看成分界线，将字符串s划分成一个个窗口，然后对每个窗口进行遍历，分别计算每个字符到窗口左右边界的距离最小值。
     * 来源于他人题解【https://leetcode-cn.com/problems/shortest-distance-to-a-character/solution/821zi-fu-de-zui-duan-ju-chi-4chong-jie-fa-javascri/】</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：1 ms, 在所有 Java 提交中击败了99.29% 的用户</li>
     *     <li>内存消耗：38.7 MB, 在所有 Java 提交中击败了27.02% 的用户</li>
     *     <li>通过测试用例：76 / 76</li>
     * </ul>
     *
     * @param s 给定字符串
     * @param c 给定出现的字符
     * @return 每个字符距离字符c最近距离的结果集数组
     */
    public int[] shortestToChar(String s, char c) {
        // 初始化窗口的左右边界
        int left = s.length();// 窗口的初始左边界设为字符串长度，必须足够大，不能为0
        int right = s.indexOf(c);// 窗口的初始右边界是字符c在字符串s中第一次出现的下标

        int[] distances = new int[s.length()];// 存放字符最短距离的结果数组
        char[] chars = s.toCharArray();// 将字符串转换成字符数组
        for (int i = 0; i < chars.length; i++) {
            // 计算字符到当前窗口左右边界的最小距离
            distances[i] = Math.min(Math.abs(i - left), Math.abs(right - i));
            // 遍历完当前窗口后，则将整个窗口右移
            if (i == right) {
                // 重置窗口的左右边界下标
                left = right;
                right = s.indexOf(c, left + 1);// 寻找从left位置开始之后的第一次出现字符c的下标
            }
        }

        return distances;
    }
}
