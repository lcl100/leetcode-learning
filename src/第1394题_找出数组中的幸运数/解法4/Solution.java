package 第1394题_找出数组中的幸运数.解法4;

import java.util.Arrays;

class Solution {
    public int findLucky(int[] arr) {
        // 1. 先将arr数组进行排序，因为提供的可能是乱序数组
        Arrays.sort(arr);

        // 2. 变量声明
        // 2.1 存放幸运数的变量，初始值为-1，表示没有幸运数
        int finalVal = -1;
        // 2.2 存放每个不同的数
        int low = arr[0];
        // 2.3 慢指针，指向第一个数
        int i = 0;
        // 2.4 快指针，指向第一个与arr[i]不同的数
        int j = 0;

        // 3. 循环遍历arr数组
        while (j < arr.length) {
            // 快指针j移动j+low个位置
            j += low;
            if (j > arr.length) {
                return finalVal;
            } else if (j == arr.length) {
                if ((j - i) == low && arr[j - 1] == arr[i]) {
                    finalVal = low;
                }
            } else if (arr[j] == arr[i]) {
                while (arr[j] == arr[i]) {
                    j++;
                    if (j >= arr.length) {
                        return finalVal;
                    }
                }
                i = j;
                low = arr[j];
            } else if (arr[j] != arr[i] && (j - i) == low && arr[j - 1] == arr[i]) {
                finalVal = arr[i];
                low = arr[j];
                i = j;
            } else if (arr[j] != arr[i] && (j - i) == low && arr[j - 1] != arr[i]) {
                while (arr[j] != arr[i]) {
                    i++;
                }
                j = i;
                low = arr[j];
            }
        }

        return finalVal;
    }
}
/*
    解题思路：
        1. 利用两根指针，最核心的思想就是例如[2,2,3,3,3]，初始j为0，那么就跳2个位置，即比较a[2]与a[0]，然后后面一个数是3，那么又在原来的基础上跳3个位置为a[5]
        2. 各种边界条件比较多，所以不过多赘述
 */