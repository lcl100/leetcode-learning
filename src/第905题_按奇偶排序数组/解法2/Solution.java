package 第905题_按奇偶排序数组.解法2;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;// 指向奇数的指针
        int j = A.length - 1;// 指向偶数的指针
        while (i < j) {
            // 如果遇到的是偶数，则直接跳过去
            while (A[i] % 2 == 0 && i < j) {
                i++;
            }
            // 如果遇到的是奇数，则直接跳过去
            while (A[j] % 2 != 0 && i < j) {
                j--;
            }
            // 交换奇数A[i]和偶数A[j]
            if (A[i] % 2 != 0 && A[j] % 2 == 0) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }
}
/*
    解题思路：
        0.双指针
        1.定义两根指针，一根指针i指向奇数，从前往后遍历查找，如果遇到的是偶数跳过去，如果遇到的是奇数则停下来
        2.一根指针j指向偶数，从后往前遍历查找，如果遇到的是奇数则直接跳过去，如果遇到的是偶数则停下来
        3，交换奇数A[i]和偶数A[j]的值
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了95.50% 的用户
 */