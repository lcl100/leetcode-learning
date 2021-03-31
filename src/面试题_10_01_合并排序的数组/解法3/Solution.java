package 面试题_10_01_合并排序的数组.解法3;

class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        // i指向A中m个元素的索引，倒序；j指向B中n各元素的索引，倒序；a指向整个A数组中所有元素的索引，倒序
        int i = m - 1, j = n - 1, a = A.length - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] < B[j]) {
                A[a] = B[j];
                a--;
                j--;
            } else if (A[i] == B[j]) {
                A[a] = A[i];
                a--;
                i--;
                A[a] = B[j];
                a--;
                j--;
            } else {
                A[a] = A[i];
                a--;
                i--;
            }
        }
        // 处理A中剩余的元素
        while (i >= 0) {
            A[a] = A[i];
            a--;
            i--;
        }
        // 处理B中剩余的元素
        while (j >= 0) {
            A[a] = B[j];
            a--;
            j--;
        }
    }
}
/*
    解题思路：
        0.倒序双指针，是解法2的优化，不需要单独提取A中m个元素
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.5 MB, 在所有 Java 提交中击败了58.32% 的用户
 */