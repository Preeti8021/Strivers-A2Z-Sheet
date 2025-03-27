/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class ReverseDLL {
    public DLLNode reverseDLL(DLLNode head) {
        if(head ==null || head.next == null){
            return head; 
        }
        DLLNode curr = head; 
        DLLNode left = null; 
        
        while(curr!=null){
            left = curr.prev; 
            curr.prev = curr.next; 
            curr.next = left; 
            
            curr = curr.prev; 
        }
        return left.prev; 
    }
}


/* no additional checks before*/
class ReverseDLL2 {
    public DLLNode reverseDLL(DLLNode head) {
        DLLNode curr = head; 
        DLLNode left = null; 
        
        while(curr!=null){
            left = curr.prev; 
            curr.prev = curr.next; 
            curr.next = left; 
            
            curr = curr.prev; 
        }
        if(left!=null){
            return left.prev; 
        }
        return head; 
    }
}
