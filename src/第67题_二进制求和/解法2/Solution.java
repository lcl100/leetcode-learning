package 第67题_二进制求和.解法2;

/**
 * @author lcl100
 * @create 2021-09-04 17:23
 */
public class Solution {
    /**
     * <p>思路：单层for循环</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，判断两个二进制字符串长度是否相等，如果不等则在短的二进制字符串的高位补0</li>
     *     <li>第二步，创建局部变量</li>
     *     <li>第三步，倒序遍历两个字符数组，进行相加操作</li>
     *     <li>第四步，收尾工作，注意需要判断最后是否还存在进位，如果存在则需要添加一个'1'。比如"1010"和"1011"</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：2 ms, 在所有 Java 提交中击败了94.75% 的用户</li>
     *     <li>内存消耗：38.5 MB, 在所有 Java 提交中击败了30.24% 的用户</li>
     *     <li>通过测试用例：294 / 294</li>
     * </ul>
     *
     * @param a 第一个二进制字符串
     * @param b 第二个二进制字符串
     * @return 两个二进制字符串相加的和
     */
    public String addBinary(String a, String b) {
        // 第一步，判断两个二进制字符串长度是否相等，如果不等则在短的二进制字符串的高位补0
        // 例如：a="11",b="1"，那么处理后是a="11",b="01"
        if (a.length() > b.length()) {
            b = addZero(b, a.length() - b.length());
        } else if (a.length() < b.length()) {
            a = addZero(a, b.length() - a.length());
        }

        // 第二步，创建局部变量
        char[] aChars = a.toCharArray();// 将a字符串转换成字符数组
        char[] bChars = b.toCharArray();// 将b字符串转换成字符数组
        boolean isCarry = false;// 是否进位的标志，true表示两位字符相加存在进位（'1'+'1'），false表示不存在进位（'0'+'1'或'0'+'0'）
        StringBuilder result = new StringBuilder();// 保存相加结果的字符串

        // 第三步，倒序遍历两个字符数组，进行相加操作
        for (int i = a.length() - 1; i >= 0; i--) {
            char aBit = aChars[i];
            char bBit = bChars[i];
            if (aBit + bBit == 96) {// '0'+'0'=96
                // 在插入之前，需要先判断上两位相加是否有进位，因为0+0=0，如果前面有进位，则需要插入'1'，如果前面没有进位则插入'0'
                result.insert(0, isCarry ? '1' : '0');
                // 设置当前相加（是在已经判断上两位相加的基础上的处理）是否会产生进位，0+0=0不会产生进位
                isCarry = false;
            } else if (aBit + bBit == 97) {// '0'+'1'=97 或 '1'+'0'=91
                // 在插入之前，需要先判断上两位相加是否有进位，因为0+1=1，如有进位则会1+1=10，也会产生进位，则需要插入'0'；如果没有进位则仍然插入两个相加的结果'1'
                result.insert(0, isCarry ? '0' : '1');
                // 如果上两位没有进位，则0+1=1不会进位，则isCarry仍然为false；如果上两位有进位，则0+1+1=10会产生进位，则isCarr仍然为true，所以代码如下
                isCarry = isCarry;
            } else if (aBit + bBit == 98) {// '1'+'1'=98
                // 在插入之前，需要先判断上两位相加是否有进位，因为1+1=10已经产生进位，如果上两位有进位则1+1+1=11，则插入'1'；如果上两位没有进位则1+1+0=10，则插入'0'
                result.insert(0, isCarry ? '1' : '0');
                // 设置当前相加（是在已经判断上两位相加的基础上的处理）是否会产生进位，1+1+0=10一定会产生进位，1+1+1也一定会产生进位，所以设置为true
                isCarry = true;
            }
        }

        // 第四步，收尾工作，注意需要判断最后是否还存在进位，如果存在则需要添加一个'1'。比如"1010"和"1011"
        if (isCarry) {
            result.insert(0, '1');
        }
        return result.toString();
    }

    /**
     * <p>为短的二进制字符串的高位添加0。</p>
     * <p>例如：<code>str='1',zeroCount=1 => return '01';</code></p>;
     *
     * @param str       短的二进制字符串
     * @param zeroCount 要在高位添加0的个数
     * @return 返回添加0后的二进制字符串
     */
    private String addZero(String str, int zeroCount) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zeroCount; i++) {
            sb.append('0');
        }
        sb.append(str);
        return sb.toString();
    }
}