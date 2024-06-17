//Insert node (remember to add the null condition for head) 
//1. beginning of the LinkedList - first create node, then point the next of node to head, update head
//2. end of linkedin list - create a temp node, iterate through head till last node, update lastnode next as new node 

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}

public class InsertNode
{
    //Function to insert a node at the beginning of the linked list.
    static Node insertAtBeginning(Node head, int x)
    {
        Node n = new Node(x); 
        if(head == null){
            return n; 
        }
        n.next = head; 
        head = n; 
        return head; 
    }
    
    //Function to insert a node at the end of the linked list.
    static Node insertAtEnd(Node head, int x)
    {
        Node temp = head; 
        Node n = new Node(x); 
        if(head== null){
            return n; 
        }
        while(temp.next!= null){
            temp = temp.next; 
        }
        temp.next = n; 
        return head; 
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    public static void main(String[] args) {
        Node head = null;
      
        // Inserting nodes at the beginning
        head = insertAtBeginning(head, 3);
        head = insertAtBeginning(head, 2);
        head = insertAtBeginning(head, 1);
      
        // Inserting nodes at the end
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 5);

        // Printing the linked list
        printList(head);
    }
}






//Other way to create linkedlist in main method using user input

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;

        System.out.println("Enter the number of initial nodes:");
        int n = scanner.nextInt();
        System.out.println("Enter the values for the nodes:");

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            head = insertAtEnd(head, value);
        }

        System.out.println("Initial linked list:");
        printList(head);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Print the linked list");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter the value to insert at the beginning:");
                int value = scanner.nextInt();
                head = insertAtBeginning(head, value);
            } else if (choice == 2) {
                System.out.println("Enter the value to insert at the end:");
                int value = scanner.nextInt();
                head = insertAtEnd(head, value);
            } else if (choice == 3) {
                printList(head);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
*/
