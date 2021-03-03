package 第448题_找到所有数组中消失的数字.解法2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // 1. 对输入的数组nums进行排序
        Arrays.sort(nums);

        // 2. 利用双指针处理
        // 2.1 创建一个List集合，用来保存消失的数字
        List<Integer> list = new ArrayList<>();
        // 2.2 定义两个指针i和j，其中i不是指下标，是具体的数字，从1到nums.length，而j是指nums数组的下标索引
        int i = 1; // [1,n]数组的指针，其实[1,n]就是从1到nums.length中所有数字（包括1和nums.length），它们可以成为一个数组，但在代码中是以变量形式递增的，而没有专门构建一个数组
        int j = 0;// nums数组的指针，表示下标索引
        // 2.3 循环遍历nums数组，当i或j超出指定范围时结束循环
        while (i <= nums.length && j < nums.length) {
            // 2.3.1 如果[1,n]数组中的i元素小于nums[j]，表示nums数组中没有该元素，即是消失的数字
            if (i < nums[j]) {
                // 2.3.1.1 那么将该数字添加到集合中保存
                list.add(i);
                // 2.3.1.2 并且i指针前进一步
                i++;
                // 2.3.2 如果i元素等于nums[j]，表示在nums数组中存在i元素
            } else if (i == nums[j]) {
                // 那么i和j指针同时前进一步
                i++;
                j++;
                // 2.3.3 如果i元素大于nums[j]，表示nums数组中可能存在等于i的数字
            } else {
                // 那么j指针前进一步
                j++;
            }
        }
        // 2.4 如果nums数组已经遍历完成，但[1,n]数组中仍有元素，那么将i到nums.length剩余的元素都添加到集合中
        while (i <= nums.length) {
            list.add(i);
            i++;
        }

        // 3. 返回保存了消失的数字的List集合
        return list;
    }

    public static void main(String[] args) {
        List<Integer> disappearedNumbers = new Solution().findDisappearedNumbers(new int[]{1, 1});
        System.out.println(disappearedNumbers);
    }
}
/*
    解题思路：
        1.将数组进行排序
        2.分别用两根指针指向两个数组（可以说从1到nums.length也是一个数组），然后比较i和num[j]的值，并做对应处理
        3.返回集合List
 */