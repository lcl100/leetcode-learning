package 第1704题_判断字符串的两半是否相似.解法1;

class Solution {
    public boolean halvesAreAlike(String s) {
        // 将字符串分割成两个等长的字符串，如"book"分割成"bo"和"ok"
        String str1 = s.substring(0, s.length() / 2).toLowerCase();
        String str2 = s.substring(s.length() / 2).toLowerCase();
        // 记录str1和str2两个字符串种元音字母的个数
        return count(str1) == count(str2);
    }

    // 计算字符串str中所有小写元音字母的出现次数
    private int count(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
/*
    解题思路：
        1.统计从中间分割成两个字符串的元音字母个数
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了96.13% 的用户
    内存消耗：37.2 MB, 在所有 Java 提交中击败了15.32% 的用户
 */