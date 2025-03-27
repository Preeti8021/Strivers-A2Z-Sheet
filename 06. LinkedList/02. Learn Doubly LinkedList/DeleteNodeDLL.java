/*class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class DeleteNodeDLL {
    public Node deleteNode(Node head, int x) {
        if(head==null){
            return head; 
        }
        if(x==1){
            head = head.next; 
            if(head!=null){
                head.prev = null;
            }
            return head; 
        }
        
        Node curr = head; 
        
        for(int i = 1; i<x; i++){
            curr = curr.next; 
        }
        
        Node prev = curr.prev; 
        Node right = curr.next; 
        
        prev.next = right; 
        if(right!=null){
            right.prev = prev; 
        }
        
        return head; 
    }
}
