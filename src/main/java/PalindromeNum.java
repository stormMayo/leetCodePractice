/**
 * 回文数字判断
 */
public class PalindromeNum {
    public static void main(String[] argus){
        int x = 12233221;
        boolean palindrome = isPalindrome(x);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        String s = x + "";
        char[] chars = s.toCharArray();
        int j = chars.length-1;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == chars[j] && i <= j){
                j--;
                if(i == j || i > j){
                    break;
                }
            }else {
                return false;
            }
        }
        return true;
    }
    
}
