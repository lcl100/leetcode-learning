package 第415题_字符串相加.解法3;

/**
 * @author lcl100
 * @create 2021-09-05 13:57
 */
public class Solution {

    /**
     * <p>思路：解法2的优化。</p>
     * <p>优化：</p>
     * <ul>
     *     <li>优化一，优化掉了对前导零的处理。</li>
     * </ul>
     * <p>步骤：</p>
     * <ul>
     *      <li>第一步，同时循环遍历两个字符串，计算相等长度的数字和，并处理两数相加的进位问题</li>
     *      <li>第二步，处理字符串剩余数字字符的情况</li>
     *      <li>第三步，收尾，处理还可能存在进位的情况，即如果存在进位则插入'1'</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：3 ms, 在所有 Java 提交中击败了38.56% 的用户</li>
     *     <li>内存消耗：38.4 MB, 在所有 Java 提交中击败了61.06% 的用户</li>
     *     <li>通过测试用例：317 / 317</li>
     * </ul>
     *
     * @param num1 第一个数字字符串
     * @param num2 第二个数字字符串
     * @return 返回相加求和的结果字符串
     * @see {@link 第67题_二进制求和.解法2.Solution}
     */
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1;// 双指针，i指向行num1中的字符，j指向num2中的字符
        int carry = 0;// 进位标志
        StringBuilder result = new StringBuilder();// 存放结果的字符串

        // 第一步，同时循环遍历两个字符串，计算相等长度的数字和，并处理两数相加的进位问题
        while (i >= 0 && j >= 0) {
            // 得到当前字符所表示的十进制数字
            int n1 = num1.charAt(i) - '0';
            int n2 = num2.charAt(j) - '0';
            // 计算两数相加的结果和，让进位也参与运算
            result.insert(0, (n1 + n2 + carry) % 10);
            // 设定两数相加是否产生进位
            carry = (n1 + n2 + carry) / 10;
            // 继续遍历下一个数字字符
            i--;
            j--;
        }

        // 第二步，处理字符串剩余数字字符的情况
        // 可能两个字符串的长度不一致，那么一定会有一个字符串会剩余一些数字字符没有相加，可以同0相加并且再与进位相加得到结果，相当于间接处理了前导零
        // 当num1字符串中存在剩余字符的情况
        while (i >= 0) {
            int n1 = num1.charAt(i) - '0';
            // 其实这里n2可以相当于0
            result.insert(0, (n1 + carry) % 10);
            carry = (n1 + carry) / 10;
            i--;
        }
        // 当num2字符串中存在剩余字符的情况
        while (j >= 0) {
            int n2 = num2.charAt(j) - '0';
            result.insert(0, (n2 + carry) % 10);
            carry = (n2 + carry) / 10;
            j--;
        }

        // 第三步，收尾，处理还可能存在进位的情况，即如果存在进位则插入'1'
        if (carry != 0) {
            result.insert(0, carry);
        }
        return result.toString();
    }
}
