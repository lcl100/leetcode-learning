package 第1437题_是否所有1都至少相隔k个元素.解法3;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = k;// 巧妙地处理了第一个1出现的问题
        for (int num : nums) {
            if (num == 1) {
                if (count < k){
                    return false;
                }
                count = 0;
            } else {
                count++;// 计算0出现的次数
            }
        }
        return true;
    }
}
/*
    解题思路：
        0.计算出现次数
        1.计算0出现的次数，而不是1出现的次数
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：48.6 MB, 在所有 Java 提交中击败了10.98% 的用户
 */