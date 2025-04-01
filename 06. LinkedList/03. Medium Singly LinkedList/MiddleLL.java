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
class MiddleLL {
    public ListNode middleNode(ListNode head) {
        ListNode temp= head; 
        int size = 0; 
        while(temp!=null){
            size++;
            temp = temp.next; 
        }
        if(size%2!=0){ //odd size 
            ListNode temp2 = head; 
            for(int i = 1; i<=(size/2); i++){
                temp2 = temp2.next;
            }
            head = temp2; 
        }
        else{  //even size
            ListNode temp2 = head; 
            for(int i = 1; i<=(size/2); i++){
                temp2 = temp2.next; 
            }
            head = temp2;
        }
        return head; 
    }
}