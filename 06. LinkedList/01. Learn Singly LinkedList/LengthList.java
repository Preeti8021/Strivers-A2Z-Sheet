/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class LengthList {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int length = 0; 
        Node temp = head; 
        while(temp!=null){
            temp = temp.next; 
            length++; 
        }
        return length; 
    }
}