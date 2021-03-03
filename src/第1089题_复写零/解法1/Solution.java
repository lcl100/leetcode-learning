package 第1089题_复写零.解法1;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public void duplicateZeros(int[] arr) {
        // 1.实例化集合List
        List list = new ArrayList();

        // 2.循环遍历数组并比较是否有0，然后添加至集合
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                list.add(arr[i]);
                list.add(arr[i]);
                len--;// 注意：即使添加了两个0，但数组的总长度不会改变，所以其实是删除了最后一个元素，这里通过改变数组长度的方式实现了删除
            } else {
                list.add(arr[i]);
            }
        }

        // 3.再将list中的元素复制到arr数组中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(list.get(i).toString());
        }
    }
}
/**
 * 思路：
 * 利用集合List，循环数组元素，如果该元素是0则在集合中添加两个0
 */
