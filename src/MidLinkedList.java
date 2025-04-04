 /**
 * Middle of a Linked List
 * <p>
 * Given the head of a singly linked list, return the middle node of the linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * <p>
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 * <p>
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/description/">Click here</a>
 */

public class MidLinkedList {
    public ListNode middleNode(ListNode head) {

        ListNode dummy = new ListNode(0, head);
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == null) {
                return slow;
            } else if (fast.next == null) {
                return slow;
            }
        }

        return head;
    }
}
