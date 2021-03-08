package 第1394题_找出数组中的幸运数.解法3;

import java.util.Arrays;

/**
 * @author 二木成林
 * 解法3的Solution.java的优化
 */
public class SolutionOptimization {
    public int findLucky(int[] arr) {
        // 1. 先将arr数组进行排序，因为提供的可能是乱序数组
        Arrays.sort(arr);

        // 2. 变量声明
        // 2.1 start指针，用来指向每个不同的数
        int start = arr[0];
        // 2.2 计数器，记录每个不同的数的出现次数，也就是记录与start相同的数的出现次数
        int count = 0;
        // 2.3 最终返回值，默认为-1，表示没有找到幸运数
        int finalVal = -1;

        // 3. 循环遍历arr数组，统计每个不同的数的出现次数
        for (int i = 0; i < arr.length; i++) {
            // 3.1 如果取模为0，表示是相同的数，那么计数器加1
            if (start % arr[i] == 0) {
                count++;
                // 特殊情况，特殊处理
                if (i == arr.length - 1) {
                    if (start == count) {
                        finalVal = count;
                    }
                }
                // 3.2 如果不为0，表示是一个与start不同的数，那么判断是否是幸运数，如果是则赋值给finalVal，如果不是则跳转start指针，继续寻找
            } else {
                if (start == count) {
                    finalVal = count;
                }
                start = arr[i];
                count = 1;
            }
        }

        // 4. 最后返回幸运数，不用寻找最大值，因为如果有更大的幸运数，那么finalVal会覆盖掉前面的幸运数
        return finalVal;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 7, 7, 7, 7, 7, 7};
        System.out.println(new SolutionOptimization().findLucky(arr));
    }
}