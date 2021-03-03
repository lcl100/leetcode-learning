package 第26题_删除排序数组中的重复项.解法4;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
/**
 * 思路：双指针法
 * 数组完成排序后，我们可以放置两个指针i和j，其中i是慢指针，而j是快指针。只要nums[i]=nums[j]，我们就增加j以跳过重复项。
 * 当我们遇到nums[i]≠ nums[i]时，跳过重复项的运行已经结束，因此我们必须把它(nums[i])的值复制到nums[i＋1]。
 * 然后递增i，接着我们将再次重复相同的过程，直到j到达数组的末尾为止。
 */
