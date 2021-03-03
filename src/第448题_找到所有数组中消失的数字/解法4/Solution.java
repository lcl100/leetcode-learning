package 第448题_找到所有数组中消失的数字.解法4;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 1. 创建一个新数字，将nums数组中所有元素存储到newArr数组中对应下标的位置
        int[] newArr = new int[nums.length];
        for (int num : nums) {
            newArr[num - 1] = num;// num-1即可得出该num应当存在newArr数组中的位置
        }

        // 2. 创建一个List集合，将newArr数组中为空的元素添加到集合中
        List<Integer> list = new ArrayList<>();
        for (int i1 = 0; i1 < newArr.length; i1++) {
            if (newArr[i1] == 0) {// 注意，整型在Java中，默认赋值为0，所以判断是否为0即可
                list.add(i1 + 1);
            }
        }

        // 3. 返回集合
        return list;
    }

    public static void main(String[] args) {
        List<Integer> disappearedNumbers = new Solution().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(disappearedNumbers);
    }
}
/*
    解题思路：
        1.创建一个新数组，将原数组中的每个元素放到它该在的位置（即值减1所在的索引处），最后新数组中元素值为0的即为缺少的元素
 */
