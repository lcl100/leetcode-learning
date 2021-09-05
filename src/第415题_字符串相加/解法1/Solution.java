package 第415题_字符串相加.解法1;

import java.math.BigInteger;

/**
 * @author lcl100
 * @create 2021-09-05 12:17
 */
class Solution {
    /**
     * <p>思路：单层for循环</p>
     * <p>步骤：</p>
     * <ul>
     *      <li>第一步，添加前导零，例如："123"和"1"添加前导零是"123"和"001"</li>
     *      <li>第二步，局部变量</li>
     *      <li>第三步，循环遍历等长的字符串，计算每两位相加的和，并且处理进位问题</li>
     *      <li>第四步，收尾，最后仍然需要判断是否进位，即数字字符串的最高位是否会产生进位</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：5 ms, 在所有 Java 提交中击败了11.62% 的用户</li>
     *     <li>内存消耗：39.2 MB, 在所有 Java 提交中击败了5.07% 的用户</li>
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
        boolean isCarry = false;// 进位标志，判断两位数相加是否进位
        StringBuilder result = new StringBuilder();// 存放结果的字符串

        //
        for (int i = num1.length() - 1; i >= 0; i--) {
            // 将数字字符转换成整数int类型
            int n1 = Integer.parseInt(String.valueOf(chars1[i]));
            int n2 = Integer.parseInt(String.valueOf(chars2[i]));
            // 由于这里采用的是布尔值来作为进位标志，不能直接参与运算，必须进行判断
            // (n1+n2)%10是得到两个数（例如6+5=11）的余数1，由于可能存在进位所以要(n1+n2)%10+1
            // 但(n1+n2)%10+1又可能产生进位（例如：(8+1)%10+1=10），所以还需要再对10取余，即((n1 + n2) % 10 + 1) % 10
            result.insert(0, isCarry ? ((n1 + n2) % 10 + 1) % 10 : (n1 + n2) % 10);
            // 得到两位数相加的结果后，还需要判断是否会产生进位
            isCarry = isCarry ? (n1 + n2 + 1) >= 10 : (n1 + n2) >= 10;
        }

        // 第四步，收尾，最后仍然需要判断是否进位，即数字字符串的最高位是否会产生进位
        if (isCarry) {
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