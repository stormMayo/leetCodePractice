/**
 * 回文数字判断
 */
public class PalindromeNum {
    public static void main(String[] argus){
        int x = 12233221;
        int t = 8;
        System.out.println(t%10);

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

    //将数据一半反转
    public static boolean isPalindrome2(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0) )
            return false;
        int reverseNumber = 0;
        while (x > reverseNumber){
            reverseNumber = reverseNumber * 10 + x % 10;
            x = x / 10;
        }
        return reverseNumber ==  x || x == reverseNumber / 10;
    }
    
}
