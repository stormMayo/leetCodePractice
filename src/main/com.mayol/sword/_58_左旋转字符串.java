
package sword;

/**
 *https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * @param null
 * @return
 */
public class _58_左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        return  s.substring(n, s.length()) + s.substring(0, n);
    }

}
