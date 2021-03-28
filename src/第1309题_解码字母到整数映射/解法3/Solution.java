package 第1309题_解码字母到整数映射.解法3;

public class Solution {
    public String freqAlphabets(String s) {
        // 遍历字符串
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            if (i + 2 < s.length()) {
                if (s.charAt(i + 2) == '#') {
                    String str = s.charAt(i) + "" + s.charAt(i + 1);
                    int num = Integer.parseInt(str);
                    sb.append((char) (num + 96));// 加96，是因为'a'字符的ASCII值为97，而字符串中的数字字符是从'1'开始的，所以加96就足够了
                    i += 3;
                    continue;
                }
            }
            sb.append((char) (Integer.parseInt(s.charAt(i) + "") + 96));
            i++;
        }
        return sb.toString();
    }
}
/*
    解题思路：
        0.直接映射
 */
/*
    执行用时：7 ms, 在所有 Java 提交中击败了14.17% 的用户
    内存消耗：37.1 MB, 在所有 Java 提交中击败了18.83% 的用户
 */