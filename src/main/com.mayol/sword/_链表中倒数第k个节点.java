
package sword;

import leetcode.ListNode;

public class _链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode first = head;
        ListNode second = head;

        while (k-- > 0) {
            first = first.next;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
