/**
 *  Reverse Linked List II
 *  <p>
 *      Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
 *  </p>
 * <a href="https://leetcode.com/problems/reverse-linked-list-ii/">Click here</a>
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0, head);
        ListNode start = dummy;

        //Before left stays the same
        // 1->
        for (int i = 1; i < left; i++) {
            start = start.next;
        }

        //Current is now at LEFT position node
        ListNode curr = start.next;
        //Prev is at one node start LEFT node
        ListNode prev = start;

        //Say left is node 2
        //Node 2 onwards reverse the linkage
        //Reverse only the linked list in between left and right
        for (int i = left; i <= right; i++) {
            ListNode nextNode = curr.next;
            //Point the next node to previous
            //This will cause a loop linkage in previous node
            curr.next = prev;
            //Move previous forward
            prev = curr;
            //Move current forward
            curr = nextNode;
        }
        //At the end of the loop, prev contains the reverse linked list

        //Finally, we are still missing two linkages
        //In the process of reversing, the linkage of LEFT and the node start LEFT is looped.
        //So, to break the loop, point start of the loop to curr, which is now the set after RIGHT node.
        start.next.next = curr;
        //And point the LEFT node to the previous
        start.next = prev;

        //Return dummy.next, which is equal to start
        return dummy.next;
    }
}
