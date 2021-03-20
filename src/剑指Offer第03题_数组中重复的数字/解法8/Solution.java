package 剑指Offer第03题_数组中重复的数字.解法8;

class Solution {
    public int findRepeatNumber(int[] nums) {
        // 由于nums数组中的数在[0,n-1]范围内，所以创建这个数组
        int[] newNums = new int[nums.length];
        // 对数组中每个元素的出现次数计数
        for (int num : nums) {
            newNums[num]++;
        }
        // 循环遍历相信数组，判断哪个数的出现次数大于1
        for (int i = 0; i < newNums.length; i++) {
            if (newNums[i] > 1) {
                // 它们和索引是一对一对应的，所以返回索引即可
                return i;
            }
        }
        return -1;
    }
}
/*
    解题思路：
        0.每个元素都可以落在数组中的指定位置
        1.由于nums数组中的数的范围是确定，所以每个数都可以落在数组的指定位置
        2.那么只需要将该数作为新数组newNums的索引进行计数即可，表示该数的出现次数
        3.如果出现次数大于1则返回
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了83.47% 的用户
    内存消耗：46 MB, 在所有 Java 提交中击败了82.78% 的用户
 */