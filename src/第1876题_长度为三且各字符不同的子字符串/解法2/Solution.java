package 第1876题_长度为三且各字符不同的子字符串.解法2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lcl100
 * @create 2021-09-05 22:16
 */
public class Solution {
    /**
     * <p>思路：截取长度为3的子字符串，通过Map来统计字符串中每个字符的出现次数，从而来判断该字符串是否是"好"字符串。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：4 ms, 在所有 Java 提交中击败了9.58% 的用户</li>
     *     <li>内存消耗：38.4 MB, 在所有 Java 提交中击败了13.23% 的用户</li>
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
        // 将字符串中的每个字符存入Map集合，并且统计其出现次数
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        // 遍历集合中每个字符的出现次数，如果有字符的出现次数大于1，则表示不是"好"字符串
        for (Character key : map.keySet()) {
            if (map.get(key) > 1) {
                return false;
            }
        }
        return true;
    }

}
