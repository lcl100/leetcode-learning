package 第415题_字符串相加.解法4;

/**
 * @author lcl100
 * @create 2021-09-05 14:30
 */
public class Solution {
    /**
     * <p>思路：解法3的优化。</p>
     * <p>优化：</p>
     * <ul>
     *     <li>优化一，优化掉了多个while循环（即对两个数字位数不同情况的处理），使得最剩下一个while循环，简化代码。</li>
     * </ul>
     * <p>步骤：</p>
     * <ul>
     *      <li>第一步，同时循环遍历两个字符串，计算相等长度的数字和，并处理两数相加的进位问题</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：3 ms, 在所有 Java 提交中击败了38.56% 的用户</li>
     *     <li>内存消耗：38.4 MB, 在所有 Java 提交中击败了64.84% 的用户</li>
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

        // 通过下面这个while循环就可以处理掉当字符串还剩余字符的情况了
        while (i >= 0 || j >= 0 || carry != 0) {
            // 得到当前字符所表示的十进制数字，当下标i或j为负数时返回0就等价于对位数较短的数字进行了补零操作，这样就可以优化掉两个数字位数不同的代码
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            // 计算两数相加的结果和，让进位也参与运算
            result.insert(0, (n1 + n2 + carry) % 10);
            // 设定两数相加是否产生进位
            carry = (n1 + n2 + carry) / 10;
            // 继续遍历下一个数字字符
            i--;
            j--;
        }

        return result.toString();
    }
}
