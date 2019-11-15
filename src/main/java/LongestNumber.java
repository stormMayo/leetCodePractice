import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class LongestNumber {
    public static void main(String[] argus){
        String s = "abcdcba";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<Character>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;

    }
}
