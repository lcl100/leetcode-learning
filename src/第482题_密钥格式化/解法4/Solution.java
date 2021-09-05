package 第482题_密钥格式化.解法4;

/**
 * @author lcl100
 * @create 2021-09-05 19:59
 */
public class Solution {

    /**
     * <p>思路：数组，将字符存放到数组中，效率更高。</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，统计字符串中非破折号字符的个数，并且将小写字母字符转换成大写字母字符存入原数组</li>
     *     <li>第二步，倒序将chars数组中的非破折号字符向结果数组result赋值，并且每K个元素插入一个破折号字符</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：3 ms, 在所有 Java 提交中击败了100.00% 的用户</li>
     *     <li>内存消耗：38.6 MB, 在所有 Java 提交中击败了50.13% 的用户</li>
     *     <li>通过测试用例：38 / 38</li>
     * </ul>
     *
     * @param S 密钥字符串
     * @param K 数字K，使得每个分组恰好包含K个字符
     * @return 返回格式化后的密钥字符串
     */
    public String licenseKeyFormatting(String S, int K) {
        // 第一步，统计字符串中非破折号字符的个数，并且将小写字母字符转换成大写字母字符存入原数组
        int count = 0;// 字符串中非破折号字符的个数
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '-') {
                // 统计非破折号字符的个数
                count++;
                // 将小写字母字符转换成大写字母字符存入原数组
                chars[i] = chars[i] >= 'a' ? (char) (chars[i] - 32) : chars[i];
            }
        }

        // 如果没有字符则返回空字符串
        if (count == 0) {
            return "";
        }

        // 计算分隔符的个数
        int separator = count / K;
        // 如果正好整除，分隔符个数 - 1
        separator = count % K == 0 ? separator - 1 : separator;

        // 第二步，倒序将chars数组中的非破折号字符向结果数组result赋值，并且每K个元素插入一个破折号字符
        char[] result = new char[count + separator];
        int index = result.length - 1;// 指向result数组的下标
        int letter = 0;// 统计已赋值的字符个数
        for (int i = chars.length - 1; i >= 0; i--) {
            // 处理非破折号字符
            if (chars[i] != '-') {
                // 将非破折号字符放入到result数组中
                result[index] = chars[i];
                index--;
                letter++;
                // 每K个元素插入一个破折号字符
                if (letter % K == 0 && index != -1) {
                    result[index] = '-';
                    index--;
                }
            }
        }
        return new String(result);
    }
}
