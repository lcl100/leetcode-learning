package LCP第18题_早餐组合.解法2;

import java.util.Arrays;

public class Solution {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        /*
           例：
            输入：staple = [2,1,1], drinks = [8,9,5,1], x = 9
            排序：staple = [1,1,2], drinks = [1,5,8,9], x = 9
            输出：8
         */
        // 1.对staple数组和drinks数组排序
        Arrays.sort(staple);
        Arrays.sort(drinks);
        // 2.统计
        int count = 0;// 计数器，用来统计购买方案种数
        int mod = (int) Math.pow(10, 9) + 7;// 变量，答案需要以 1e9 + 7 (1000000007) 为底取模，因为可能数过大，无法表示所以需要取模
        int i = 0, j = drinks.length - 1;// 双指针，i指针指向staple数组下标并且从前往后遍历，j指针指向drinks数组下标从后往前遍历
        while (i < staple.length && j >= 0) {
            // 这个循环找到drinks数组中第一个staple[i] + drinks[j]<=x的索引j（倒序查找），所以drinks数组中前j+1个元素加上staple[i]一定小于等于x，直接让count加上j+1即可
            while (j >= 0 && staple[i] + drinks[j] > x) {
                j--;// 更新j指针
            }
            count += j + 1;// j是指下标索引从0开始的，而j+1表示获取包括索引j在内的前j+1个数
            count %= mod;// 注意，可能count会过于大，所以每次循环都要对mod进行取模
            i++;// 更新i指针
        }
        return count %= mod;// 最后也要取模，返回取模后的数
    }

    public static void main(String[] args) {
        System.out.println(new Solution().breakfastNumber(new int[]{1, 1, 2}, new int[]{1, 5, 8, 9}, 9));
    }
}
/*
    解题思路：
        1.先对两个数组排序
        2.双指针i和j，其中i指向staple数组索引，从前往后遍历，其中j指向drinks数组索引，从后往前遍历
            2.1在drinks数组中倒序遍历j指针所指向的元素，找到第一个staple[i] + drinks[j]<=x的索引，那么前j+1个元素加上staple[i]一定小于等于x，直接让count加上j+1即可
            2.2所以直接让count加上j+1即可
            2.3注意，count可能过于大，所以每次循环都要对Math.pow(10, 9) + 7取模
        3.返回对Math.pow(10, 9) + 7取模后的count
 */
/*
    执行用时：84 ms, 在所有 Java 提交中击败了63.98% 的用户
    内存消耗：58.3 MB, 在所有 Java 提交中击败了20.34% 的用户
 */
