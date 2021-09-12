package 第41题_缺失的第一个正数.解法1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lcl100
 * @create 2021-09-11 21:36
 */
class Solution {
    /**
     * <p>思路：将数组排序后，保存数组中的正整数到集合中，再通过集合中相邻元素之差是否为1来判断缺失的正数。</p>
     * <p>步骤：</p>
     * <ul>
     *     <li>第一步，将数组排序</li>
     *     <li>第二步，将数组中的正整数添加到集合中（不包括0）</li>
     *     <li>第三步，判断相邻元素差是否为1，如果不为1，那么表示list.get(i)+1不存在</li>
     * </ul>
     * <p>结果：成功（但不满足时间复杂度为O(n)和常数级别的额外空间）</p>
     * <ul>
     *     <li>执行用时:9 ms ，在所有Java提交中击败了 12.89%的用户</li>
     *     <li>内存消耗:97.7 MB ，在所有Java提交中击败了 9.76%的用户</li>
     *     <li>通i过测试用例:171/ 171</li>
     * </ul>
     *
     * @param nums 未排序的整数数组
     * @return 数组中没有出现的最小的正整数
     */
    public int firstMissingPositive(int[] nums) {
        // 第一步，将数组排序
        Arrays.sort(nums);
        // 第二步，将数组中的正整数添加到集合中（不包括0）
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num > 0) {
                list.add(num);
            }
        }
        // 如果集合为空表示全是负数则返回1，或者集合中的第一个元素大于1那么缺失的第一个正数一定是1
        if (list.size() == 0 || list.get(0) > 1) {
            return 1;
        }
        // 第三步，判断相邻元素差是否为1，如果不为1，那么表示list.get(i)+1不存在
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) > 1) {
                return list.get(i) + 1;
            }
        }
        // 还可能存在一种情况，例如[0,1,2]，那么缺失的就是3，即为集合中的最后一个元素的值加1
        return list.get(list.size() - 1) + 1;
    }
}