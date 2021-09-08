package 第821题_字符的最短距离.解法1;

/**
 * @author lcl100
 * @create 2021-09-07 23:19
 */
class Solution {
    /**
     * <p>思路：写两个方法，分别求在当前字符之前（包括当前字符）存在字符c的下标，在当前字符之后（包括当前字符）存在字符c的下标，计算当前字符的下标与二者下标的绝对差值，得到最小差值，然后保存到数组中。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：27 ms, 在所有 Java 提交中击败了6.56% 的用户</li>
     *     <li>内存消耗：38.8 MB, 在所有 Java 提交中击败了6.99% 的用户</li>
     *     <li>通过测试用例：76 / 76</li>
     * </ul>
     *
     * @param s 给定字符串
     * @param c 给定出现的字符
     * @return 每个字符距离字符c最近距离的结果集数组
     */
    public int[] shortestToChar(String s, char c) {
        // 存放距离的结果数组
        int[] distances = new int[s.length()];
        // 将字符串s转换成字符数组
        char[] chars = s.toCharArray();
        // 循环遍历字符数组中的每个字符
        for (int i = 0; i < chars.length; i++) {
            // 寻找字符c在字符串s中下标i之前第一次出现的下标位置
            int before = before(s, c, i);
            // 寻找字符c在字符串s中下标i之后第一次出现的下标位置
            int after = after(s, c, i);
            // 判断before和after是否等于-1，在都不等于-1的情况下取最小绝对差值
            distances[i] = before == -1 ? Math.abs(after - i) : after == 1 ? Math.abs(before - i) : Math.min(Math.abs(before - i), Math.abs(after - i));
        }
        // 返回结果数组
        return distances;
    }

    /**
     * <p>寻找字符串str中下标cur向后的第一个字符c出现的下标，如果没有找到则返回-1。</p>
     *
     * @param str 待检索的字符串
     * @param c   待检索的字符
     * @param cur 指定的下标位置
     * @return 向cur之后找字符c出现的位置，如果找到则返回该字符c在字符串str中的下标，如果没有找到则返回-1
     */
    private int before(String str, char c, int cur) {
        char[] chars = str.toCharArray();
        for (int i = cur; i >= 0; i--) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }

    /**
     * <p>寻找字符串str中下标cur向前的第一个字符c出现的下标，如果没有找到则返回-1。</p>
     *
     * @param str 待检索的字符串
     * @param c   待检索的字符
     * @param cur 指定的下标位置
     * @return 向cur之前找字符c出现的位置，如果找到则返回该字符c在字符串str中的下标，如果没有找到则返回-1
     */
    private int after(String str, char c, int cur) {
        char[] chars = str.toCharArray();
        for (int i = cur; i < chars.length; i++) {
            if (chars[i] == c) {
                return i;
            }
        }
        return -1;
    }
}