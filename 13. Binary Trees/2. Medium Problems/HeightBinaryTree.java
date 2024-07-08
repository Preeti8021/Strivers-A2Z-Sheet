//Logic: Same like level order, just create a variable called height and increment whenever go to next level

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0; 
        Queue<TreeNode> q = new LinkedList<TreeNode>(); 
        if(root == null){
            return 0; 
        }
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size(); 
            for(int i = 0; i<levelSize; i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                q.poll();
            }
            depth+=1; 
        }
        return depth;
    }
}