package 第1221题_分割平衡字符串.解法2;

import java.util.Stack;

/**
 * @author lcl100
 * @create 2021-09-06 20:43
 */
public class Solution {

    /**
     * <p>思路：解法1的优化。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：1 ms, 在所有 Java 提交中击败了34.28% 的用户</li>
     *     <li>内存消耗：36.3 MB, 在所有 Java 提交中击败了33.33% 的用户</li>
     *     <li>通过测试用例：40 / 40</li>
     * </ul>
     *
     * @param s 平衡字符串
     * @return 可以通过分割得到的平衡字符串的最大数量
     */
    public int balancedStringSplit(String s) {
        int count = 0;
        Stack stack = new Stack();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            // 优化了解法1种的if-else判断
            if (stack.isEmpty() || (char) stack.peek() == aChar) {
                stack.push(aChar);
            } else {
                stack.pop();
                count += stack.isEmpty() ? 1 : 0;
            }
        }
        return count;
    }
}
