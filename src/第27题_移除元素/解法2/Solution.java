package 第27题_移除元素.解法2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int removeElement(int[] nums, int val) {
        // 1.将nums元素复制到创建的List中
        List<Integer> list=new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        // 2.判断集合中是否包含该元素，如果包含，则删除该元素
        while (list.contains(val)){
            list.remove((Object)val);// 注意重载方法remove，因为val是int类型的原因，很容易删除成index
        }
        // 3.重新将集合中所有元素复制到nums中
        for (int i = 0; i < list.size(); i++) {
            nums[i]=list.get(i);
        }
        // 4.返回新数组长度
        return list.size();
    }
}
/**
 * 思路：
 * 通过Java内置的的List来删除元素，首先将元素保存到集合List中，然后利用remove()方法删除，再将删除后的List保存到nums中返回
 */
