package 第482题_密钥格式化.解法2;

/**
 * @author lcl100
 * @create 2021-09-05 18:19
 */
class Solution {

    /**
     * <p>思路：单指针倒序遍历</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，单指针，倒序遍历字符串，遇到破折号则跳过，同时将当前字符转换为大写字母插入到结果字符串中，当遍历K个字符后（不包括破折号），则插入一个破折号字符</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：91 ms, 在所有 Java 提交中击败了12.40% 的用户</li>
     *     <li>内存消耗：38.4 MB, 在所有 Java 提交中击败了79.16% 的用户</li>
     *     <li>通过测试用例：38 / 38</li>
     * </ul>
     *
     * @param S 密钥字符串
     * @param K 数字K，使得每个分组恰好包含K个字符
     * @return 返回格式化后的密钥字符串
     */
    public String licenseKeyFormatting(String S, int K) {
        // 指针，指向字符串S中的下标，从字符串中的最后一个字符开始
        int i = S.length() - 1;
        // 计数器，记录字符串S中非破折号字符的个数
        int count = 0;
        // 保存格式化后的密钥字符串的结果
        StringBuilder result = new StringBuilder();
        // 倒序遍历字符串
        while (i >= 0) {
            // 获取当前正在遍历的字符
            char c = S.charAt(i);
            // 判断如果不是破折号字符则添加到result中
            if (c != '-') {
                // 非破折号字符个数加一
                count++;
                // 插入到result中，同时注意将小写字母字符转换成大写字母字符
                result.insert(0, c >= 'a' ? (char) (c - 32) : c);
                // 当插入K个非破折号字符后，向result中插入破折号字符"-"
                if (count == K && i != 0) {
                    result.insert(0, '-');
                    count = 0;
                }
            }
            // 继续遍历下一个字符
            i--;
        }
        // 处理s是"--a-a-a-a--"或"---"的特殊情况
        return (result.length() > 0 && result.charAt(0) == '-') ? result.substring(1) : result.toString();
    }
}