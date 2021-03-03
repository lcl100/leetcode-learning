package 第35题_搜索插入位置.解法1;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int flag = 0;// 0表示没有匹配到该元素，其他值表示索引
        // 1.如果数组中存在target元素，则直接返回索引
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                flag = i;
            }
        }
        // 2.判断中flag==0表示数组中不存在匹配target的元素，需要另行处理，即返回第一个大于等于target元素的索引
        if (flag == 0) {
            boolean max = false;// 一个标志，表示target元素大于数组中的所有元素
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= target) {
                    flag = i;
                    break;// 注意，要跳出去
                } else {
                    max = true;// 标为true，表示target比数组中所有元素都大
                }
            }
            if (flag == 0 && max) {
                flag = nums.length;// 如果target比所有元素都大，则返回数组长度为添加的索引
            }
        }
        return flag;
    }
}
/**
 * 思路：暴力破解
 * 首先判断数组中是否有该元素，如果有则返回该元素的索引；
 * 如果没有该元素，则判断其比哪个元素值小，则返回该处索引值
 * 分析示例，发现有四种情况，加上测试出的一种情况是5种情况：
 * 第一种：数组中存在该元素，可直接返回该元素索引
 * 第二种：数组中不存在该元素，返回第一个大于target元素的索引，注意是第一个，需要通过break跳出循环
 * 第三种：target大于数组中所有元素，则直接返回数组的长度即为添加索引，需要一个判断标志来判断它是否大于所有元素
 * 第四种：target小于数组中所有元素，则直接返回0
 * 第五种：是测试遇到的，即  输入：[1],1；输出：0  。这种情况是需要在第三种情况考虑的，即大于等于
 */