package leetcode;

/**
 * TODO
 *
 实现 strStr() 函数。
 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 示例 1:
 输入: haystack = "hello", needle = "ll"
 输出: 2
 */
public class StrStr28 {
    public static void main(String[] argus){
        String haystack = "hello", needle = "ll";
        Solution solution = new Solution();
        int i = solution.strStr(haystack, needle);
        System.out.println(i);
    }
    static class Solution {
        public int strStr(String haystack, String needle) {
            if(haystack == null || haystack == "" || needle == null)
                return -1;
            if( needle == "")
                return 0;
            if(haystack.contains(needle)){
                return haystack.indexOf(needle);
            }else {
                return -1;
            }
        }
    }
}
