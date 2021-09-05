package 第1876题_长度为三且各字符不同的子字符串.解法1;

/**
 * @author lcl100
 * @create 2021-09-05 22:07
 */
class Solution {
    /**
     * <p>思路：将字符串转换成字符数组，判断连续的三个字符是否均不同，如果均不同则count计数加1</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户</li>
     *     <li>内存消耗：36.7 MB, 在所有 Java 提交中击败了45.61% 的用户</li>
     *     <li>通过测试用例：160 / 160</li>
     * </ul>
     *
     * @param s 输入的字符串
     * @return "好"字符串的个数
     */
    public int countGoodSubstrings(String s) {
        // 计数器，统计"好"字符串的个数
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 2; i++) {
            // 判断连续三个字符是否不相等
            if (chars[i] != chars[i + 1] && chars[i + 1] != chars[i + 2] && chars[i] != chars[i + 2]) {
                count++;
            }
        }
        return count;
    }
}
