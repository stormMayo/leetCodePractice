/**
 * You are given two non-empty linked lists representing
 * two non-negative integers. The digits are stored in reverse order
 * and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode currentNode = pre;
        int flag = 0;
        while(l1 != null || l2 != null){
            int m = l1 == null ? 0 : l1.val;
            int n = l2 == null ? 0 : l2.val;
            int sum = m + n + flag;
            flag = sum / 10;
            sum = sum % 10;
            currentNode.next = new ListNode(sum);
            currentNode = currentNode.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(flag == 1){
            currentNode.next = new ListNode(flag);
        }
        return  pre.next;
    }
}
