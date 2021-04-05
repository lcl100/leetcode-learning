package 第88题_合并两个有序数组.解法4;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 三根指针
        int k = nums1.length - 1;// 其中k指向nums1数组，控制合并后的有序数组元素索引移动
        m--; // 直接用m和n来作为nums1和nums2中有效元素的倒序索引
        n--;// 但注意，索引是从0开始的，而有效下标应该是长度减1
        // 倒序遍历nums1和nums2数组
        while (m >= 0 && n >= 0) {
            if (nums1[m] < nums2[n]) {
                nums1[k] = nums2[n];
                k--;
                n--;
            } else if (nums1[m] == nums2[n]) {
                nums1[k] = nums1[m];
                k--;
                m--;
                nums1[k] = nums2[n];
                k--;
                n--;
            } else if (nums1[m] > nums2[n]) {
                nums1[k] = nums1[m];
                k--;
                m--;
            }
        }
        // 2.处理num1数组和num2数组中i和j剩下的元素，即如果i和j没有到0就表示还有剩余元素
        while (m >= 0) {
            nums1[k] = nums1[m];
            k--;
            m--;
        }
        while (n >= 0) {
            nums1[k] = nums2[n];
            k--;
            n--;
        }
    }
}
/*
    解题思路：
        0.逆序双指针
        1.用两根指针i和j逆序读取nums1和nums2数组对应索引元素
        2.处理num1数组和num2数组中i和j剩下的元素，即如果i和j没有到0就表示还有剩余元素
    总结：
        1.双指针和逆序双指针的区别就是，前者需要创建一个与nums1等大的数组来放排好序的元素，而后者是原地修改数组
 */
/*
    执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
    内存消耗：38.7 MB, 在所有 Java 提交中击败了26.63% 的用户
 */