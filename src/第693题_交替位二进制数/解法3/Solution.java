package 第693题_交替位二进制数.解法3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lcl100
 * @create 2021-09-06 22:49
 */
public class Solution {

    /**
     * <p>思路：用Map集合来存放'0'和'1'字符，Map的键值对中的键存放'0'或'1'字符，而值存放该字符在数组中的索引。如果存在连续的相同字符，它们的索引之差为1；如果存在不连续的相同字符，它们的索引之差为2。</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，将十进制整数转换成二进制字符串，并且转换成字符数组。</li>
     *     <li>第二步，用一个Map集合来存储'0'和'1'字符，存储每个字符的下标。</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：1 ms, 在所有 Java 提交中击败了13.21% 的用户</li>
     *     <li>内存消耗：35.2 MB, 在所有 Java 提交中击败了46.76% 的用户</li>
     *     <li>通过测试用例：204 / 204</li>
     * </ul>
     *
     * @param n 十进制数字
     * @return 如果它的二进制数表示总是0、1交替出现则返回true
     */
    public boolean hasAlternatingBits(int n) {
        // 第一步，将十进制整数转换成二进制字符串，并且转换成字符数组
        String binaryStr = Integer.toBinaryString(n);
        char[] chars = binaryStr.toCharArray();
        // 第二步，用一个Map集合来存储'0'和'1'字符，存储每个字符的下标
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            // 如果Map集合中不存在该字符，那么就将该字符存入Map集合中
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], i);
            } else {
                // 如果Map集合中存在该字符，那么表示可以判断两个相同字符是否相邻，如果它们的索引之差为1则表示两个相同字符相邻那么直接返回false，如果索引之差为2则更新该字符的索引
                if (i - map.get(chars[i]) == 2) {
                    map.put(chars[i], i);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
