package 第693题_交替位二进制数.解法2;

import java.util.Stack;

/**
 * @author lcl100
 * @create 2021-09-06 22:28
 */
public class Solution {

    /**
     * <p>思路：使用技巧，只要二进制字符串中不包含"11"和"00"，那么就是交替位二进制数。</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，将十进制整数转换成二进制字符串。</li>
     *     <li>第二步，直接判断二进制字符串中是否不包含"11"和"00"，只要都不包含则'0'和'1'相邻。</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：1 ms, 在所有 Java 提交中击败了13.21% 的用户</li>
     *     <li>内存消耗：35 MB, 在所有 Java 提交中击败了88.69% 的用户</li>
     *     <li>通过测试用例：204 / 204</li>
     * </ul>
     *
     * @param n 十进制数字
     * @return 如果它的二进制数表示总是0、1交替出现则返回true
     */
    public boolean hasAlternatingBits(int n) {
        // 第一步，将十进制整数转换成二进制字符串。
        String binaryStr = Integer.toBinaryString(n);
        // 第二步，直接判断二进制字符串中是否不包含"11"和"00"，只要都不包含则'0'和'1'相邻
        return !binaryStr.contains("11") && !binaryStr.contains("00");
    }
}
