package 第821题_字符的最短距离.解法3;

/**
 * @author lcl100
 * @create 2021-09-08 21:33
 */
public class Solution {
    /**
     * <p>思路：从左向右遍历，记录上一个字符 C 出现的位置 prev，那么答案就是 i - prev。从右向左遍历，记录上一个字符 C 出现的位置 prev，那么答案就是 prev - i。这两个值取最小就是答案。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：1 ms, 在所有 Java 提交中击败了99.29% 的用户</li>
     *     <li>内存消耗：38.9 MB, 在所有 Java 提交中击败了5.23% 的用户</li>
     *     <li>通过测试用例：76 / 76</li>
     * </ul>
     *
     * @param s 给定字符串
     * @param c 给定出现的字符
     * @return 每个字符距离字符c最近距离的结果集数组
     */
    public int[] shortestToChar(String s, char c) {
        int[] distances = new int[s.length()];
        char[] chars = s.toCharArray();

        // 从左向右遍历
        int prev = Integer.MIN_VALUE / 2;
        for (int i = 0; i < chars.length; i++) {
            // 存放上一个字符c的下标
            if (chars[i] == c) {
                prev = i;
            }
            // 计算差值
            distances[i] = i - prev;
        }

        // 从右往左遍历
        prev = Integer.MAX_VALUE / 2;
        for (int i = chars.length - 1; i >= 0; i--) {
            // 存放上一个字符c的下标
            if (chars[i] == c) {
                prev = i;
            }
            // 计算最小绝对差值
            distances[i] = Math.min(distances[i], prev - i);
        }

        return distances;
    }
}
