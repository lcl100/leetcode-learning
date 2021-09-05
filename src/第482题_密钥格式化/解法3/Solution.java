package 第482题_密钥格式化.解法3;

import java.util.Stack;

/**
 * @author lcl100
 * @create 2021-09-05 19:43
 */
class Solution {

    /**
     * <p>思路：栈的先进后出特性。因为要倒序遍历字符串，所以符合先进后出的特性，可以采用栈来实现。</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，将所有非破折号字符并且转换成大写字母字符入栈</li>
     *     <li>第二步，将栈顶字符出栈，并且每K个字符用破折号字符进行分隔插入到result</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：100 ms, 在所有 Java 提交中击败了9.10% 的用户</li>
     *     <li>内存消耗：39 MB, 在所有 Java 提交中击败了28.36% 的用户</li>
     *     <li>通过测试用例：38 / 38</li>
     * </ul>
     *
     * @param S 密钥字符串
     * @param K 数字K，使得每个分组恰好包含K个字符
     * @return 返回格式化后的密钥字符串
     */
    public String licenseKeyFormatting(String S, int K) {
        // 第一步，将所有非破折号字符并且转换成大写字母字符入栈
        int i = 0;
        Stack stack = new Stack();
        while (i < S.length()) {
            char c = S.charAt(i);
            if (c != '-') {
                // 将非破折号字符，并且将小写字母转换成大写字母填入栈中
                stack.push(c >= 'a' ? (char) (c - 32) : c);
            }
            i++;
        }

        // 第二步，将栈顶字符出栈，并且每K个字符用破折号字符进行分隔插入到result
        StringBuilder result = new StringBuilder();
        int count = 0;// 已经插入到result字符串中字符的个数
        int len = stack.size();// 非破折号字符的个数
        // 循环遍历栈
        while (!stack.isEmpty()) {
            // 插入到result中的字符加1
            count++;
            // 将栈顶元素插入到result中，并且将栈顶元素出栈
            result.insert(0, stack.pop());
            // 每K个字符插入一个破折号字符
            if (count % K == 0 && count != len) {
                result.insert(0, '-');
            }
        }
        return result.toString();
    }
}