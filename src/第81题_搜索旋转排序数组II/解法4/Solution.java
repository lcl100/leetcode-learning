package 第81题_搜索旋转排序数组II.解法4;

class Solution {
    public boolean search(int[] nums, int target) {
        // 查找nums数组中第一个顺序不同的索引
        // 例如：[2,5,6,0,0,1,2]中[2,5,6]是有序的，[0,0,1,2]也是有序的，所以找到6的索引就可以了（其实这里保存的是第一个0的索引）
        int index = 0;// 保存索引
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                index = i;
                break;
            }
        }
        // 由于原有序数组经过旋转变成无序数组，所以下面经过三次旋转就可以恢复为原数组的顺序
        /*
                 nums: [2,5,6, 0,0,1,2]
            第一次交换: [6,5,2, 0,0,1,2]
            第二次交换: [6,5,2, 2,1,0,0]
            第三次交换: [0,0,1, 2,2,5,6]
         */
        reverse(nums, 0, index);
        reverse(nums, index, nums.length);
        reverse(nums, 0, nums.length);
        // 此时只需要二分查找目标数即可
        return binSearch(nums, 0, nums.length - 1, target);
    }

    // 交换chars数组中指定start索引和end索引之间的元素，范围是[start,end)
    private void reverse(int[] nums, int start, int end) {
        for (int i = 0; i < (end - start) / 2; i++) {
            int temp = nums[start + i];
            nums[start + i] = nums[end - 1 - i];
            nums[end - 1 - i] = temp;
        }
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
        0.旋转+二分查找
        1.一切由旋转开始也该由旋转结束，原有序数组经过旋转变成了无序，所以经过三次交换恢复原数组顺序
        2.然后经过二分查找，判断目标数target是否存在
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了88.78% 的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了25.45% 的用户
 */