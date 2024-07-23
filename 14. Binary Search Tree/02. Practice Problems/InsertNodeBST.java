//Logic: if we found a node, whose left is greater than target, then move till 
//we find null update the leaf left with new node, else same for right, finally return the modified tree
//tc - O(logn)

public class InsertNodeBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        TreeNode temp = root;
        while(true){
            if(temp.val > val){
                if(temp.left != null){
                    temp = temp.left; 
                }
                else{
                    temp.left = new TreeNode(val);
                    break;
                }
            }
            else{
                if(temp.right !=null){
                    temp = temp.right;
                }
                else{
                    temp.right = new TreeNode(val);
                    break;
                }
            }
        }
        return root; 
    }
}

/**
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */