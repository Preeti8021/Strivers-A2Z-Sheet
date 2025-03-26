class IntroDLL {
    Node constructDLL(int arr[]) {
        Node head = new Node(arr[0]); 
        Node curr = head; 
        for(int i = 1; i<arr.length; i++){
            Node temp = curr;
            curr.next = new Node(arr[i]); 
            curr = curr.next; 
            curr.prev = temp; 
        }
        return head; 
    }
}