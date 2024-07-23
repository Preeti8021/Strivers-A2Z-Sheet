//Logic: If root value is equal to target, return that node. If null is found return null. 
// if root value less than target search in right side of root using recursion (i.e root.right)
// else search in left side of root, but calling the function recursively on root.left 

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
public class SearchInBST { 
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        else if(root.val<val){
            TreeNode temp = root.right; 
            return searchBST(temp,val);
        }
        else{
            TreeNode temp = root.left;
            return searchBST(temp,val);
        }
    }
}


// TC - O(1) - best case 
//    - O(log n) - average case (balanced tree)
//    - O(n) - worst case (unbalanced tree)

// SC - O(1) - best case 
//    - O(log n) - average case (balanced tree)
//    - O(n) - worst case (unbalanced tree)
//space complexity because of the recursive calls which uses stack space 