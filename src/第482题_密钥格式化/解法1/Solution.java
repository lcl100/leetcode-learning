package 第482题_密钥格式化.解法1;

/**
 * @author lcl100
 * @create 2021-09-05 17:56
 */
class Solution {
    /**
     * <p>思路：Java的API</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，利用Java的API删除掉原字符串中的所有破折号，并且将其全部转换成大写字母</li>
     *     <li>第二步，倒序循环遍历字符串，每隔K个字符则添加一个破折号</li>
     * </ul>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：103 ms, 在所有 Java 提交中击败了8.97% 的用户</li>
     *     <li>内存消耗：39.1 MB, 在所有 Java 提交中击败了19.39% 的用户</li>
     *     <li>通过测试用例：38 / 38</li>
     * </ul>
     *
     * @param S 密钥字符串
     * @param K 数字K，使得每个分组恰好包含K个字符
     * @return 返回格式化后的密钥字符串
     */
    public String licenseKeyFormatting(String S, int K) {
        // 第一步，利用Java的API删除掉原字符串中的所有破折号，并且将其全部转换成大写字母
        S = S.replaceAll("-", "").toUpperCase();

        // 第二步，倒序循环遍历字符串，每隔K个字符则添加一个破折号
        StringBuilder result = new StringBuilder();// 保存结果的字符串
        char[] chars = S.toCharArray();// 将输入字符串S转换成字符数组
        int count = 0;// 计数器，记录已经遍历过的字符个数，此时字符串中已经不存在破折号字符了
        for (int i = chars.length - 1; i >= 0; i--) {
            // 记录字符个数
            count++;
            // 向StringBuilder中插入一个字符，注意使用头插法（即每个新字符插入到原字符串的头部）插入字符
            result.insert(0, chars[i]);
            // 当已经遍历K个字符后插入破折号字符，但需要注意当字符数刚好是K的整数倍，则不需要插入分隔字符符号，所以需要添加i!=0的判断
            if (count % K == 0 && i != 0) {
                result.insert(0, '-');
                // 同时将count置为0，开始下一次的记录
                count = 0;
            }
        }
        return result.toString();
    }
}