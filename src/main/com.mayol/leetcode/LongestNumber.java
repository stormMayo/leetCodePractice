package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * 标签：滑动窗口
 * 定义一个 map 数据结构存储 (k, v)，其中 key 值为字符，value 值为字符位置 +1，加 1 表示从字符位置后一个才开始不重复
 * 我们定义不重复子串的开始位置为 start，结束位置为 end
 * 随着 end 不断遍历向后，会遇到与 [start, end] 区间内字符相同的情况，此时将字符作为 key 值，获取其 value 值，并更新 start，此时 [start, end] 区间内不存在重复字符
 * 无论是否更新 start，都会更新其 map 数据结构和结果 ans。
 * 时间复杂度：O(n)O(n)
 */
public class LongestNumber {
    public static void main(String[] argus) {
        String s = "abcdcba";
        int i = lengthOfLongestSubstring2(s);
        System.out.println(i);
    }

    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<Character>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;

    }

    private static int lengthOfLongestSubstring2(String s) {
        int n = s.length(),ans = 0;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int start = 0,end = 0;end < n ; end++){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end)),start);
            }
            ans = Math.max(ans,end-start+1);
            map.put(s.charAt(end),end + 1);
        }
        return ans;
    }

}
