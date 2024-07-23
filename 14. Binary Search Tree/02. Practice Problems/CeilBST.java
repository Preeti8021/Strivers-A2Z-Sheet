//Logic: using iteration, if root value is less than key, then move right
//if root value greater than key, update result and move left 
//root value equal to key, return result

class CeilBST {
    int findCeil(Node root, int key) {
        int result = -1; 
        if (root == null) return -1;
        while(root!=null){
            if(root.data == key){
                result = root.data; 
                return result;
            }
            else if(root.data < key){
                root = root.right; //if less than key, dont update
            }
            else {
                result = root.data; 
                root = root.left; 
            }
        }
        return result; 
    }
}

//TC - O(h) where h is height of tree 
//(h = log n where n is number of nodes)