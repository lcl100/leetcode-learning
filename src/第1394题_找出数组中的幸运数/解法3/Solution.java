package 第1394题_找出数组中的幸运数.解法3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int findLucky(int[] arr) {
        // 1. 先将arr数组进行排序，因为提供的可能是乱序数组
        Arrays.sort(arr);

        // 2. 变量设定
        // 2.1 设置一个start指针，用来指向当前数，出数值为数组的第一个数
        int start = arr[0];
        // 2.2 用来记录每个数的出现次数
        int count = 0;
        // 2.3 List集合，用来保存幸运数
        List<Integer> list = new ArrayList<>();

        // 3. 循环遍历arr数组，统计每个数的出现次数
        for (int i = 0; i < arr.length; i++) {
            // 3.1 用start对arr[i]取模，如果等于0表示与start相同，那么count次数加1
            if (start % arr[i] == 0) {
                count++;
                // 特殊情况，特殊处理
                if (i == arr.length - 1) {
                    if (start == count) {
                        list.add(count);
                    }
                }
                // 3.2 由于数组事先进行了排序，所以相同的数字是连续的，如果start%arr[i]不为0，表示连续相同的数字结束，start数字的出现次数已经统计完成
            } else {
                // 3.2.1 既然已经start出现的次数已经统计完成，可以判断该数是否是幸运数
                if (start == count) {
                    // 如果是幸运数则添加到List集合中
                    list.add(count);
                }
                // 3.2.2 如果不是幸运数，那么start指针跳到下一个数，继续循环
                start = arr[i];
                // 3.2.3 注意，这里count应该重置为1，而不是0，因为执行到这里，表示arr[i]已经不等于start了，那么计算器count应该有一个值了
                count = 1;
            }
        }

        // 4. 判断集合是否为空，来判断是否存在幸运数
        if (list.isEmpty()) {
            // 集合为空，表示没有幸运数，那么返回-1
            return -1;
        }

        // 5. 寻找集合中的最大值，即如果存在多个幸运数，那么要求返回最大的幸运数
        int max = list.get(0);
        for (Integer val : list) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 7, 7, 7, 7, 7, 7};
        System.out.println(new Solution().findLucky(arr));
    }
}
/*
    解题思路：
        0. 必须对数组排序，然后相同的数才会连续出现，才方便统计出现次数
        1. 用一个start指针指向第一个元素，然后循环arr数组，判断start对每个元素取模是否等于0，如果等于0表示两个数相等，然后用count统计次数
        2. 如果start与count相等，表示该数是幸运数，由于可能存在多个幸运数，所以将每个幸运数存放到List集合中
        3. 最后取出List集合中的最大值就是所要求的幸运数
 */