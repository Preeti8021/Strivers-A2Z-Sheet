//Logic: as the minimum values are to the left of root, if root is not null, start storing the min
//update by going to left of root till reached null

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
public class MinInBST {
    int minValue(Node root) {
        int min = root.data; 
        Node temp = root; 
        while(temp != null){
            min = temp.data;
            temp = temp.left; 
        }
        return min;
    }
}
