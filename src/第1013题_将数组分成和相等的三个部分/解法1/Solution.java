package 第1013题_将数组分成和相等的三个部分.解法1;

class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        // 计算arr数组中所有数的总和
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        // 如果总和不是3的倍数则直接返回false
        if (sum % 3 != 0) {
            return false;
        }
        // 然后直接计算除以3的结果，要求的子和
        int subSum = sum / 3;
        int diffSum = 0;// 统计子数组中各元素的总和
        int count = 0;// 统计等于subSum的次数
        for (int i = 0; i < arr.length; i++) {
            diffSum += arr[i];// 计算子数组中各元素的和
            // 判断子数组的各元素的和是否等于要求的subSum
            if (diffSum == subSum) {
                diffSum = 0;// 如果相等，则重置diffSum
                count++;// 并且计数加1
            }

        }
        return count >= 3;// 因为可能存在多个和为0的子数组
    }
}
/*
    解题思路：
        1.先计算数组元素总和sum，然后得到三等分的和subSum
        2.再次遍历数组元素，进行相加，对元素计和，如果等于三等分的和subSum，那么表示已经找到一个合适的子数组，最后需要至少找到三个及以上才能成功返回true
 */
/*
    执行用时：1 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：46.2 MB, 在所有 Java 提交中击败了25.88% 的用户
 */
