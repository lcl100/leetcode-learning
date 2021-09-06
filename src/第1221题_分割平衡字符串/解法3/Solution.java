package 第1221题_分割平衡字符串.解法3;

/**
 * @author lcl100
 * @create 2021-09-06 20:49
 */
public class Solution {
    /**
     * <p>思路：贪心。为了最大化分割数量，我们可以不断循环，每次从s中分割出一个最短的平衡前缀，由于剩余部分也是平衡字符串，我们可以将其当作s继续分割，直至s为空时，结束循环。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户</li>
     *     <li>内存消耗：36.3 MB, 在所有 Java 提交中击败了39.94% 的用户</li>
     *     <li>通过测试用例：40 / 40</li>
     * </ul>
     *
     * @param s 平衡字符串
     * @return 可以通过分割得到的平衡字符串的最大数量
     */
    public int balancedStringSplit(String s) {
        int count = 0;// 平衡字符串的个数
        int balance = 0;// 平衡因子，如果遍历的字符是'R'则加1，如果是'L'则减1，当为0时，表示已经分割得到一个平衡字符串
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'R') {
                balance++;
            } else {
                balance--;
            }
            count += balance == 0 ? 1 : 0;
        }
        return count;
    }
}
