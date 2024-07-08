// Logic: compare both trees node using recursion, if at any point found that it is not equal return false
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true; 
        }
        else if((p==null || q==null) || p.val!=q.val){
            return false; 
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }
}


//Failed approach - to find the inorder of both the trees and check if they are equal
//test case failed - p = [1,1] q =[1,null,1]
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> a1 = new ArrayList<>(); 
        ArrayList<Integer> a2 = new ArrayList<>(); 
        boolean x = inorder(p,a1).equals(inorder(q,a2));
        return x; 
    }
    public static ArrayList<Integer> inorder(TreeNode a,ArrayList<Integer> arr){ 
        if(a==null){
            arr.add(-1);
            return arr;
        }
        inorder(a.left,arr);
        arr.add(a.val);
        inorder(a.right,arr);
        return arr; 
    }
}