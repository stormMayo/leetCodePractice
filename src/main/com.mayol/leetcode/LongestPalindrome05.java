package leetcode;

/**
 * @author mayol
 * @date 2020/6/19 10:55
 * 定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */
public class LongestPalindrome05 {
    public static void main(String[] argus){
        String s = "cbbd";
        String s1 = longestPalindrome(s);
        System.out.println(s1);

    }
//    solution One:
    public static String longestPalindrome(String s) {
        int length = s.length();
        if(length < 2){
            return s;
        }
        int maxLen = 1;
        int beginIndex = 0;
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length - 1; i++) {
            for (int j = i + 1 ; j < chars.length ; j++){
                if(j - i + 1 > maxLen && validPalindromic(chars, i, j)){
                    maxLen = j - i + 1;
                    beginIndex = i;
                }
            }
        }
        return s.substring(beginIndex, beginIndex + maxLen);
    }

    //检查当前是否回文
    private static boolean validPalindromic(char[] charArray, int left, int right){
        while (left < right){
            if(charArray[left] != charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }




}
