import java.util.HashMap;

/**
 16:给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

 有效字符串需满足：

 左括号必须用相同类型的右括号闭合。
 左括号必须以正确的顺序闭合。
 注意空字符串可被认为是有效字符串。

 */
public class IsValid16 {
    public static void main(String[] argus){
        String s = "()[]{}{(()()()()())}";

        Solution solution = new Solution();
        boolean valid = solution.isValid(s);
        System.out.println(valid);
    }


    static class Solution {
        private HashMap<Character,Character> hashMap;

        public Solution() {
            this.hashMap = new HashMap<Character, Character>();
            hashMap.put(')', '(');
            hashMap.put('}', '{');
            hashMap.put(']', '[');
        }
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                if(this.hashMap.containsKey(s.charAt(i))){
                    Character pop = stack.isEmpty() ?  '#' : stack.pop();
                    if(pop != this.hashMap.get(s.charAt(i))){
                        return false;
                    }
                }else {
                    stack.push(s.charAt(i));
                }
            }
            return stack.isEmpty();
        }
    }


}

