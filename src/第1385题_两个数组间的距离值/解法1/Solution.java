package 第1385题_两个数组间的距离值.解法1;

/**
 * @author 二木成林
 * 解法1
 */
public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i1 : arr1) {
            boolean flag = false;// 一个标记，记录i1与arr2中的每个元素的差值都大于d，如果是则置为true，不是则置为false
            for (int i2 : arr2) {
                flag = Math.abs(i1 - i2) > d;
                if(!flag){// 当flag为false时直接跳出循环，没有必要统计此次次数了
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
/*
    解题思路：
        1.暴力破解
        2.使用双重for循环，比较arr1中的每个元素与arr2中的每个元素的差值是否大于给定的d，如果都大于则用计数器count记录加1
 */