package 第989题_数组形式的整数加法.解法2;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {

        // 0.判断是否是所有元素都是9并且K值等于1的情况，如999等
        int nineCount = 0;
        for (int a : A) {
            if (a == 9) {
                nineCount++;
            }
        }
        if (nineCount == A.length && K == 1) {
            List<Integer> list = new LinkedList<>();
            list.add(1);
            for (int i = 0; i < nineCount; i++) {
                list.add(0);
            }
            return list;
        }

        // 1.将整数K转换成整型数组
        char[] charArray = String.valueOf(K).toCharArray();
        int[] newK = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            newK[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }

        // 2.调整两个数组的元素，使长度相等
        int[] newA = new int[newK.length];
        int[] moreNewK = new int[A.length];
        if (newK.length > A.length) {
            // newK: [1,2,3,4]
            // A: [2,3]
            // 需调整A长度为：newA: [0,0,2,3]
            int n = A.length - 1;
            for (int i = newA.length - 1; i > newA.length - A.length - 1; i--) {
                newA[i] = A[n];
                n--;
            }
            A = new int[newA.length];
            for (int i = 0; i < newA.length; i++) {
                A[i] = newA[i];
            }
        } else if (newK.length < A.length) {
            // newK: [1,2]
            // A: [2,3,6,8,9]
            // 需调整newK长度为：moreNewK: [0,0,0,1,2]
            int n = newK.length - 1;
            for (int i = moreNewK.length - 1; i > moreNewK.length - newK.length - 1; i--) {
                moreNewK[i] = newK[n];
                n--;
            }
            newK = new int[moreNewK.length];
            for (int i = 0; i < moreNewK.length; i++) {
                newK[i] = moreNewK[i];
            }
        }
        // 3.进行相加运算
        int m = A.length - 1;
        boolean b = false;// 标志位，标志是否有进位，如果有进位则为true
        for (int j = newK.length - 1; j >= 0; j--) {
            int add = 0;
            if (b) {
                add++;// 如果有进位则该位，需要加上1
            }
            add += A[j] + newK[j];// 获得两数相加的总和，包括了进位
            b = add > 9;// 判断是否有进位，改变标志位的值
            A[m] = add % 10;// 设定数组的值
            m--;
        }
        // 4.返回List
        List<Integer> list = new LinkedList<>();
        if (b) {
            list.add(1);
        }
        for (int i : A) {
            list.add(i);
        }
        return list;
    }
}
/**
 * 思路：暴力破解
 * 将K值处理成一个和A数组等长度的数组，位数不足，则补0，然后和另一个数组相加获得值，注意可能产生的进位
 */
