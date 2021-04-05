package 第1487题_保证文件名唯一.解法1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] getFolderNames(String[] names) {
        // 用HashMap的键key来判断是否重复，用值value来维护当前值的k
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            // 循环遍历names字符串数组，判断当前字符串是否在HashMap中存在
            if (!map.containsKey(names[i])) {
                // 如果不存在则直接添加到HashMap中
                map.put(names[i], 1);
            } else {
                // 如果已经存在，则需要进行下面的操作了
                int k = map.get(names[i]);// 取出先前出现的次数
                while (map.containsKey(names[i] + "(" + k + ")")) {// 如果出现过，那么拼接字符串，在Map中继续查找是否出现过，如果出现过则k继续更新
                    k++;
                }
                map.put(names[i] + "(" + k + ")", 1);// 将新添加了后缀的字符串添加到HashMap中，并将k置为1
                map.put(names[i], map.get(names[i]) + 1);// 更新原来names[i]次数，因为已经出现过一次了，所以进行加1更新
                names[i] = names[i] + "(" + k + ")";// 重置names字符串数组中的字符串，替换为新值，所以在这里我们修改的是原字符串数组
            }
        }
        // 直接返回原字符串数组即可
        return names;
    }
}
/*
    解题思路：
        0.HashMap
        1.创建HashMap用来判断文件名字符串是否已经出现过
        2.循环遍历字符串数组names
            2.1判断当前遍历的字符串names[i]是否在HashMap中出现过，如果出现过表示文件名重复，如果没有出现过表示文件名不冲突
                2.1.1如果HashMap中不存在键为names[i]的键值对，那么直接添加到HashMap，并将键值对中的值置为1（为1表示第一次出现，出现次数为1），也就是k，但这种说法又有些不合适，也可以说是names[i]在整个names字符串数组中的出现次数
                2.1.2如果HashMap中存在键为names[i]的键值对，表示当前文件名重复了，需要更改文件名
                    2.1.2.1取出该字符串names[i]在HashMap中的出现次数，打算更新
                    2.1.2.2注意，需要判断更新后的文件名names[i] + "(" + k + ")"是否仍然重复，如果重复则将k加1，更新出现次数，直到新文件名再没有出现过
                    2.1.2.3获取到有效的k值，那么就可以拼接有效的文件名了，所以将新不重复的文件名添加到HashMap中，键值对中的值为1，表示出现过1次了
                    2.1.2.4注意，也需要更新原来的names[i]的出现次数，表示又出现了一次
                    2.1.2.5重置字符串数组names中names[i]的内容，用新文件名进行替换，直接原地修改数组，最后就可以直接返回names数组即可
        3.直接返回修改后的原字符串数组names
 */
/*
    执行用时：102 ms, 在所有 Java 提交中击败了23.98% 的用户
    内存消耗：51.1 MB, 在所有 Java 提交中击败了66.67% 的用户
 */