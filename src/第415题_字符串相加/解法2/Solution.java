package 第415题_字符串相加.解法2;

/**
 * @author lcl100
 * @create 2021-09-05 13:41
 */
class Solution {
    /**
     * <p>思路：解法1的优化。</p>
     * <p>优化：</p>
     * <ul>
     *     <li>优化一，将原来通过API来使数字字符转换成整数优化成数字字符减去'0'即可得到它所表示的具体数字。</li>
     *     <li>优化二，采用了整数（0和1）来表示是否产生进位，而不是布尔值（false和true），这样的好处是减少对布尔值的判断，让进位也参与到运算。</li>
     * </ul>
     * <p>步骤：</p>
     * <ul>
     *      <li>第一步，添加前导零，例如："123"和"1"添加前导零是"123"和"001"</li>
     *      <li>第二步，局部变量</li>
     *      <li>第三步，循环遍历等长的字符串，计算每两位相加的和，并且处理进位问题</li>
     *      <li>第四步，收尾，最后仍然需要判断是否进位，即数字字符串的最高位是否会产生进位</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：3 ms, 在所有 Java 提交中击败了38.56% 的用户</li>
     *     <li>内存消耗：38.4 MB, 在所有 Java 提交中击败了65.73% 的用户</li>
     *     <li>通过测试用例：317 / 317</li>
     * </ul>
     *
     * @param num1 第一个数字字符串
     * @param num2 第二个数字字符串
     * @return 返回相加求和的结果字符串
     * @see {@link 第67题_二进制求和.解法2.Solution}
     */
    public String addStrings(String num1, String num2) {
        // 第一步，添加前导零，例如："123"和"1"添加前导零是"123"和"001"
        if (num1.length() < num2.length()) {
            num1 = addLeadingZero(num1, num2.length() - num1.length());
        } else if (num1.length() > num2.length()) {
            num2 = addLeadingZero(num2, num1.length() - num2.length());
        }

        // 第二步，局部变量
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int isCarry = 0;// 进位标志，判断两位数相加是否进位，0表示未进位，1表示有进位。用整数0和1来表示可以直接参与到进位运算种
        StringBuilder result = new StringBuilder();// 存放结果的字符串

        // 第三步，循环遍历等长的字符串，计算每两位相加的和，并且处理进位问题
        for (int i = num1.length() - 1; i >= 0; i--) {
            // 将数字字符转换成整数int类型
            int n1 = chars1[i] - '0';
            int n2 = chars2[i] - '0';
            // 计算当前两位数字相加的结果
            result.insert(0, (n1 + n2 + isCarry) % 10);
            // 判断是否会产生进位
            isCarry = (n1 + n2 + isCarry) / 10;
        }

        // 第四步，收尾，最后仍然需要判断是否进位，即数字字符串的最高位是否会产生进位
        if (isCarry == 1) {
            result.insert(0, '1');
        }
        return result.toString();
    }

    /**
     * <p>为指定字符串添加指定个数的前导零</p>
     *
     * @param num       指定字符串
     * @param zeroCount 指定个数的前导零
     * @return 添加前导零成功的字符串
     */
    private String addLeadingZero(String num, int zeroCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = zeroCount; i > 0; i--) {
            sb.append('0');
        }
        sb.append(num);
        return sb.toString();
    }
}
