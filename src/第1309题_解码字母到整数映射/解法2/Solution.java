package 第1309题_解码字母到整数映射.解法2;

public class Solution {
    public String freqAlphabets(String s) {
        // 创建一个包含26个英文字母的字符数组
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (97 + i);
        }
        // 遍历字符串
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            if (i + 2 < s.length()) {
                if (s.charAt(i + 2) == '#') {
                    String str = s.charAt(i) + "" + s.charAt(i + 1);
                    int num = Integer.parseInt(str);
                    sb.append(chars[num - 1]);
                    i += 3;
                    continue;
                }
            }
            sb.append(chars[Integer.parseInt(s.charAt(i) + "")-1]);
            i++;
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.使用数组存储映射关系
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了14.17% 的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了20.85% 的用户
 */