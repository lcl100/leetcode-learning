package 第1704题_判断字符串的两半是否相似.解法2;

public class Solution {
    public boolean halvesAreAlike(String s) {
        // 将字符串中的字母全部转换成小写字母
        s = s.toLowerCase();
        // str1Count记录前半个字符串中元音字母的个数，str2Count记录后半个字符串中元音字母的个数
        int str1Count = 0, str2Count = 0;
        // 双指针，i从前往后遍历，j从后往前遍历
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
                str1Count++;
            }
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') {
                str2Count++;
            }
            i++;
            j--;
        }
        return str1Count == str2Count;
    }
}
/*
    解题思路：
        0.双指针计数
 */
/*
    执行用时：3 ms, 在所有 Java 提交中击败了86.02% 的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了27.99% 的用户
 */