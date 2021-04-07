package 第81题_搜索旋转排序数组II.解法3;

public class Solution {
    public boolean search(int[] nums, int target) {
        // 查找nums数组中第一个顺序不同的索引
        // 例如：[2,5,6,0,0,1,2]中[2,5,6]是有序的，[0,0,1,2]也是有序的，所以找到6的索引就可以了
        int index = 0;// 保存索引
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                index = i;
                break;
            }
        }
        // 利用index将nums数组分为两个数组，然后在两个数组中分别使用二分查找来查找target目标数，只要有一个为true就表示查找到
        return binSearch(nums, 0, index - 1, target) || binSearch(nums, index, nums.length - 1, target);
    }

    // 二分查找，其中nums是待查找的数组，low是起始索引，high是结束索引，target是要查找的目标数
    private boolean binSearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return false;
    }
}
/*
    解题思路：
        0.二分查找
        1.找到nums数组中第一个逆序的索引，将数组分为有序的两个子数组
            例如：[2,5,6,0,0,1,2]
                第一个逆序的索引是"6"的索引，因为6后面的0不大于等于6，而是小于，表示逆序了
                所以将nums数组分为两个子数组[2,5,6]和[0,0,1,2]，两个数组都是有序的
        2.然后利用二分查找在两个子数组中查找目标数target，如果只要有一个子数组查找成功则返回true
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了88.78% 的用户
    内存消耗：38.1 MB, 在所有 Java 提交中击败了76.71% 的用户
 */