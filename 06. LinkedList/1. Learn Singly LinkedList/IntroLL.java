//Creating a linkedlist from an array using temp node to move 

class Node { 
    int data; 
    Node next; 
    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
} 

public class IntroLL {
    static Node constructLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node temp = head; 
        for(int i = 1; i<arr.length; i++){
            Node n = new Node(arr[i]); 
            temp.next = n; 
            temp = temp.next; 
        }
        return head; 
    }
    public static void main(String[] args){
      int[] arr = {1,2,3,4,5}; 
      Node result = constructLL(arr); 
      Node temp = result; 
      while(temp!=null){
        System.out.print(temp.data +" -> "); 
        temp = temp.next; 
      }
      System.out.print("NULL"); 
    }
}
