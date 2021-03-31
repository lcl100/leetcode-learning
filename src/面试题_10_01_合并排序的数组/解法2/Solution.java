package 面试题_10_01_合并排序的数组.解法2;

import java.util.Arrays;

class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        // 将A中m个元素单独提取出来成一个数组
        int[] newA = Arrays.copyOf(A, m);
        // i是指向newA中索引的指针；j是指向B中索引的指针；a是指向A中索引的指针
        int i=0,j=0,a=0;
        while (i<m&&j<n){
            if(newA[i]<B[j]){
                A[a]=newA[i];
                a++;
                i++;
            }else if(newA[i]==B[j]){
                A[a]=newA[i];
                a++;
                A[a]=B[j];
                a++;
                i++;
                j++;
            }else {
                A[a]=B[j];
                a++;
                j++;
            }
        }
        // 处理newA中剩余的元素
        while (i<m){
            A[a]=newA[i];
            a++;
            i++;
        }
        // 处理B中剩余的元素
        while (j<n){
            A[a]=B[j];
            a++;
            j++;
        }
    }
}
/*
    解题思路：
        0.双指针，也是本题的核心考察
        1.使用双指针比较newA（即A中m个非0元素）和B中的元素来修改排列A中的元素
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.5 MB, 在所有 Java 提交中击败了61.62% 的用户
 */