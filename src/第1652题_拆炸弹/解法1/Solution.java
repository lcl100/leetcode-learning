package 第1652题_拆炸弹.解法1;

import java.util.Arrays;

class Solution {
    public int[] decrypt(int[] code, int k) {
        // 用来存储结果的数组
        int[] result = new int[code.length];
        // 分情况讨论
        if (k == 0) {
            // 当k==0，直接返回全是0的数组
            Arrays.fill(result, k);
        } else if (k > 0) {
            // 当k>0，循环遍历重置每个数为该数后k个元素之和
            for (int i = 0; i < code.length; i++) {
                // 调用sumArrAfter()方法获取code数组中i索引之后的k个元素之和
                result[i] = sumArrAfter(code, i, k);
            }
        } else if (k < 0) {
            // 当k<0，循环遍历重置为个数为该数前k个元素之和
            for (int i = 0; i < code.length; i++) {
                // 调用sumArrBefore()方法获取code数组中i索引之前的k个元素之和
                result[i] = sumArrBefore(code, i, Math.abs(k));// 注意，这里k是负数，所以要取绝对值
            }
        }
        return result;
    }

    // 获取指定start索引之后的k个元素之和
    private int sumArrAfter(int[] code, int start, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            // code[(start + i + 1) % code.length]核心代码，如果向左超出则取余数
            sum += code[(start + i + 1) % code.length];
        }
        return sum;
    }

    // 获取指定end索引之前的k个元素之和
    private int sumArrBefore(int[] code, int end, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            // code[(end - i - 1 + code.length) % code.length]核心代码，如果向右超出则取余数
            sum += code[(end - i - 1 + code.length) % code.length];
        }
        return sum;
    }
}
/*
    解题思路：
        0.暴力破解
        1.分三种情况讨论：
            1.1当k>0时，将第 i 个数字用接下来 k 个数字之和替换，主要是向左会超出数组长度，所以要取模
            1.2当k==0时，直接返回一个全是0的数组
            1.3当k<0时，将第 i 个数字用之前 k 个数字之和替换，主要是向右索引会变成负数，所以要加上长度取模
 */
/*
    执行用时：2 ms, 在所有 Java 提交中击败了75.70% 的用户
    内存消耗：38.6 MB, 在所有 Java 提交中击败了37.42% 的用户
 */