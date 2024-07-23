//Logic: same as to find the ceil of bst (tc - O(h) where h is height of tree)

public class FloorBST {
    public static int floor(Node root, int x) {
        if(root== null){
            return -1; 
        }
        
        int floor = -1; 
        Node temp = root; 
        while(temp!=null){
            if (temp.data == x){
                floor = temp.data;
                return floor;
            }
            else if (temp.data < x){
                floor = temp.data; 
                temp = temp.right; 
            }
            else{
                temp = temp.left;
            }
        }
        return floor;
    }
}