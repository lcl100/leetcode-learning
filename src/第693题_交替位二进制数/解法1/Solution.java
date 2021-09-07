package 第693题_交替位二进制数.解法1;

/**
 * @author lcl100
 * @create 2021-09-06 22:22
 */
class Solution {
    /**
     * <p>思路：将十进制数字转换成二进制字符串，然后判断相邻字符是否相等，如果不等则返回false</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，将十进制整数转换成二进制字符串，再转换成二进制字符数组</li>
     *     <li>第二步，判断字符数组相邻字符是否不相等，如果存在相等则表示相邻两位数字相同则返回false</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：1 ms, 在所有 Java 提交中击败了13.21% 的用户</li>
     *     <li>内存消耗：35.1 MB, 在所有 Java 提交中击败了68.23% 的用户</li>
     *     <li>通过测试用例：204 / 204</li>
     * </ul>
     *
     * @param n 十进制数字
     * @return 如果它的二进制数表示总是0、1交替出现则返回true
     */
    public boolean hasAlternatingBits(int n) {
        // 第一步，将十进制整数转换成二进制字符串，再转换成二进制字符数组
        String binaryStr = Integer.toBinaryString(n);
        char[] chars = binaryStr.toCharArray();
        // 第二步，判断字符数组相邻字符是否不相等，如果存在相等则表示相邻两位数字相同则返回false
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return false;
            }
        }
        return true;
    }
}