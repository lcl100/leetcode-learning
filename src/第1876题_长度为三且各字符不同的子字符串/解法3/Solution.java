package 第1876题_长度为三且各字符不同的子字符串.解法3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lcl100
 * @create 2021-09-05 22:36
 */
public class Solution {
    /**
     * <p>思路：截取长度为3的子字符串，通过长度为26的整数数组来存储每个小写字母字符（因为题目规定了出现的是小写字母）的出现次数，从而来判断该字符串是否是"好"字符串。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：2 ms, 在所有 Java 提交中击败了27.88% 的用户</li>
     *     <li>内存消耗：38.5 MB, 在所有 Java 提交中击败了10.78% 的用户</li>
     *     <li>通过测试用例：160 / 160</li>
     * </ul>
     *
     * @param s 输入的字符串
     * @return "好"字符串的个数
     */
    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            // 提取字符个数为3的子字符串
            String substr = s.substring(i, i + 3);
            // 调用isGoodStr()方法来判断子字符串是否是"好"字符串，并进行计数
            count += isGoodStr(substr) ? 1 : 0;
        }
        return count;
    }

    /**
     * <p>判断给定字符串是否是"好"字符串。</p>
     *
     * @param str 给定字符串
     * @return 如果是"好"字符串则返回true
     */
    private boolean isGoodStr(String str) {
        // 将字符串中的每个小写字母字符存入char数组中，并且统计其出现次数
        int[] charCount = new int[26];
        // 统计每个小写字母字符的出现次数
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            charCount[aChar - 'a']++;
        }
        // 判断出现次数，如果大于1则不是"好"字符串
        for (int count : charCount) {
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

}