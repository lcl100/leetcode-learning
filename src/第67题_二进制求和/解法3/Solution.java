package 第67题_二进制求和.解法3;

import java.util.Stack;

/**
 * @author lcl100
 * @create 2021-09-04 21:04
 */
public class Solution {

    /**
     * <p>思路：栈</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，将两个字符串分别填入两个栈中</li>
     *     <li>第二步，同时循环遍历两个栈</li>
     *     <li>第三步，处理两个栈中的剩余元素，其实只有一个栈有剩余元素</li>
     *     <li>第四步，收尾工作，注意需要判断最后是否还存在进位，如果存在则需要添加一个'1'。比如"1010"和"1011"</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：4 ms, 在所有 Java 提交中击败了17.51% 的用户</li>
     *     <li>内存消耗：38.5 MB, 在所有 Java 提交中击败了27.71% 的用户</li>
     *     <li>通过测试用例：294 / 294</li>
     * </ul>
     *
     * @param a 第一个二进制字符串
     * @param b 第二个二进制字符串
     * @return 两个二进制字符串相加的和
     */
    public String addBinary(String a, String b) {
        // 第一步，将两个字符串分别填入两个栈中
        Stack aStack = getStack(a);
        Stack bStack = getStack(b);

        // 第二步，同时循环遍历两个栈
        StringBuilder result = new StringBuilder();// 保存相加结果的字符串
        boolean isCarry = false;// 是否进位的标志，true表示两位字符相加存在进位（'1'+'1'），false表示不存在进位（'0'+'1'或'0'+'0'）
        while (!aStack.isEmpty() && !bStack.isEmpty()) {
            char aBit = (char) aStack.pop();// 获取栈顶元素，并且将栈顶元素出栈
            char bBit = (char) bStack.pop();
            if (aBit == bBit) {// '0'+'0'=96 或 '1'+'1'=98
                result.insert(0, isCarry ? '1' : '0');// 如果上两位相加有进位，则0+0+1=01或1+1+1=11；如果上两位相加没有进位，则0+0+0=00或1+1+0=10
                isCarry = aBit == '1';// 至于当前两位相加的结果是否有进位，0+0=0一定没有进位，1+1=10一定有进位
            } else {// '0'+'1'=97 或 '1'+'0'=91
                result.insert(0, isCarry ? '0' : '1');// 如果上两位相加有进位，则0+1+1=10；如果上两位相加没有进位，则0+1+0=01
                // 至于当前两位相加的结果是否有进位，取决于上两位相加是否有进位，所以isCarry不变
            }
        }

        // 第三步，处理两个栈中的剩余元素，其实只有一个栈有剩余元素
        while (!aStack.isEmpty()) {
            char c = (char) aStack.pop();
            if (!isCarry) {// 如果没有进位，则插入原值
                result.insert(0, c);
                isCarry = false;
            } else {// 如果有进位，则如果c为1插入0，如果c为0则插入1
                result.insert(0, '1' - c);
                isCarry = '1' - c == 0;
            }
        }
        while (!bStack.isEmpty()) {
            char c = (char) bStack.pop();
            if (!isCarry) {// 如果没有进位，则插入原值
                result.insert(0, c);
                isCarry = false;
            } else {// 如果有进位，则如果c为1插入0，如果c为0则插入1
                result.insert(0, '1' - c);
                isCarry = '1' - c == 0;
            }
        }

        // 第四步，收尾工作，注意需要判断最后是否还存在进位，如果存在则需要添加一个'1'。比如"1010"和"1011"
        if (isCarry) {
            result.insert(0, '1');
        }
        return result.toString();
    }

    /**
     * <p>将字符串中的所有字符填入栈中。</p>
     *
     * @param str 字符串
     * @return 返回填满字符的栈
     */
    private Stack getStack(String str) {
        char[] chars = str.toCharArray();
        Stack stack = new Stack();
        for (char aChar : chars) {
            stack.push(aChar);
        }
        return stack;
    }
}