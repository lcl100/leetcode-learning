package 第824题_山羊拉丁文.解法1;

class Solution {
    public String toGoatLatin(String S) {
        // 将字符串根据空格分割成一个字符串数组
        String[] split = S.split(" ");
        // 用来保存待返回的字符串
        StringBuilder sb = new StringBuilder();
        // 循环遍历分割后的字符串数组
        for (int i = 0; i < split.length; i++) {
            // c0是遍历的字符串的第一个字符
            char c0 = split[i].charAt(0);
            // 判断第一个字符是否是元音字母
            if (isVowel(c0)) {
                // 如果是元音字母，则添加整个单词
                sb.append(split[i]);
            } else {
                // 如果不是元音字母，则移除第一个字符并将它放到末尾
                sb.append(split[i].substring(1)).append(c0);
            }
            // 无论是元音字母还是辅音字母都要添加"ma"字符串
            sb.append("ma");
            // 根据索引来决定在字符串中添加几个'a'字符
            for (int j = 0; j < (i + 1); j++) {
                sb.append("a");
            }
            // 注意，最后一个字符串不需要添加空格在后面
            if (i != split.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // 判断字母是否是元音字母
    private boolean isVowel(char c) {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
}
/*
    解题思路：
        0.单循环暴力破解
        1.将字符串段落按空格分割成字符串数组来一个个处理
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了96.22% 的用户
    内存消耗：36.7 MB, 在所有 Java 提交中击败了94.96% 的用户
 */