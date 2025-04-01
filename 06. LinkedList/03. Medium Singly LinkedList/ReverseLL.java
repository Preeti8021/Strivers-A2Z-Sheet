/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if(head== null || head.next == null){
            return head; 
        }
        ListNode curr= head.next;
        ListNode prev = head; 
        while(curr!=null){
            ListNode nextNode = curr.next; 
            curr.next = prev; 
            //update
            prev = curr; 
            curr = nextNode; 
        }
        head.next = null;
        head = prev; 
        return head; 
    }
}