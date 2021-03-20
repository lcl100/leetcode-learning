package 剑指Offer第50题_第一个只出现一次的字符.解法4;

class Solution {
    public char firstUniqChar(String s) {
        // 'a'字符的ASCII码为97；'z'字符的ASCII码为122
        // 小写字母有26个
        int[] charCount = new int[26];
        // 将字符串s转换成字符数组
        char[] chars = s.toCharArray();
        // 循环遍历字符数组，将每个字符落在数组中的唯一位置（即出现次数加1）
        for (char aChar : chars) {
            // ((int) aChar) - 97   将得到该字符应该在charCount数组中的索引位置，减97是因为'a'到'z'字符都是从97开始的，减去的话正好在26范围内
            charCount[((int) aChar) - 97]++;
        }
        // 循环遍历chars数组
        for (char aChar : chars) {
            // 判断每个字符的出现次数
            if (charCount[((int) aChar) - 97] == 1) {
                return aChar;
            }
        }
        return ' ';
    }
}
/*
    解题思路：
        0.数组
        1.由于题目种明确规定了s字符串种都是小写字母，所以'a'到'z'实际上对应的ASCII码就是97到122
        2.那么创建一个长度为26的整型数组，存放每个字符的出现次数，也就是每个字符都可以落在数组中的唯一位置（计数加1）
        3.那么最后判断数组中的每个字符的出现次数是否大于1即可
 */
/*
    执行用时：4 ms, 在所有 Java 提交中击败了99.21% 的用户
    内存消耗：38.6 MB, 在所有 Java 提交中击败了85.34% 的用户
 */