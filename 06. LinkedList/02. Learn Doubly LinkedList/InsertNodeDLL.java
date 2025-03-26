/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class InsertNodeDLL {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        if(head ==null){
            return head; 
        }
        
        if(p==0){
            return new Node(x); 
        }
        Node curr = head; 
        Node newNode = new Node(x); 
        
        int i = 0; 
        
        while(i<p && curr!=null){
            curr = curr.next; 
            i++; 
        }
        
        Node temp = curr.next; 
        
        if(curr.next!=null){
            curr.next = newNode; 
            newNode.next = temp; 
            temp.prev = newNode; 
            newNode.prev = curr; 
        }
        else{
            curr.next = newNode; 
            newNode.prev = curr; 
        }
        return head; 
    }
}