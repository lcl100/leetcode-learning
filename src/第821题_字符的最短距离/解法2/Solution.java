package 第821题_字符的最短距离.解法2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lcl100
 * @create 2021-09-07 23:47
 */
class Solution {

    /**
     * <p>思路：用一个数组记录字符c在字符串中出现过的所有下标，循环字符串字符时只判断获取当前字符与下标数组中的最小绝对差值。</p>
     * <p>结果：成功</p>
     * <ul>
     *     <li>执行用时：3 ms, 在所有 Java 提交中击败了34.23% 的用户</li>
     *     <li>内存消耗：37.9 MB, 在所有 Java 提交中击败了100.00% 的用户</li>
     *     <li>通过测试用例：76 / 76</li>
     * </ul>
     *
     * @param s 给定字符串
     * @param c 给定出现的字符
     * @return 每个字符距离字符c最近距离的结果集数组
     */
    public int[] shortestToChar(String s, char c) {
        // 第一步，计算字符c在字符串s中出现过的所有下标，存储到集合中
        List<Integer> indexes = getIndexes(s, c);
        // 第二步，循环遍历字符串中的所有字符
        char[] chars = s.toCharArray();// 将字符串转换成字符数组
        int[] distances = new int[chars.length];// 创建保存最短距离的结果数组
        for (int i = 0; i < chars.length; i++) {
            // 求当前下标与下标集合indexes中所有下标的最小距离
            distances[i] = minDistance(i, indexes);
        }
        return distances;
    }

    /**
     * <p>计算字符c在字符串s中出现过的所有的下标</p>
     *
     * @param s 字符串s
     * @param c 待查询的字符c
     * @return 返回下标集合
     */
    private List<Integer> getIndexes(String s, char c) {
        char[] chars = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * <p>计算当前遍历的字符所对应的下标与indexes集合中最小差值</p>
     *
     * @param i       当前正在遍历的字符对应的下标
     * @param indexes 集合
     * @return 返回最小差值
     */
    private int minDistance(int i, List<Integer> indexes) {
        int min = Math.abs(indexes.get(0) - i);
        for (Integer index : indexes) {
            min = Math.min(Math.abs(i - index), min);
        }
        return min;
    }
}
