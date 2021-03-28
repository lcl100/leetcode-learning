package 面试题_01_02_判定是否互为字符重排.解法3;

public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] c1 = count(s1);
        int[] c2 = count(s2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] count(String str) {
        int[] c = new int[26];
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            c[aChar - 'a']++;
        }
        return c;
    }
}
/*
    解题思路：
        0.桶计数
        1.解题思路本质上同解法2一样，都是统计字符个数，但这里使用的是桶计数，即用数组来统计每个字符的出现次数
    总结：
        1.效率高得多
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：36 MB, 在所有 Java 提交中击败了92.73% 的用户
 */