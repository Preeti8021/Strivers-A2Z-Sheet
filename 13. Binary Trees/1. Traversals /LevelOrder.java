/*Logic: 
Create a queue to store nodes: This will help in processing each level of the tree.
Create a list to store numbers of the current level: This will temporarily store the values of nodes at the current level.
Add the root node to the queue: This initializes the queue with the starting point of the traversal.
While the queue is not empty: This loop ensures that all levels are processed.
Get the number of nodes at the current level (level size): This helps in segregating levels.
Process each node in the current level:
Take the first element (node) from the queue.
Check if it has left and right children and add them to the queue: This prepares the queue for the next level.
Add the value of the current node to the list of current level values: This collects the values of nodes at the current level.
Add the list of current level values to the final result list: This stores the level-wise values in the final result.
*/


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>(); 
        List<List<Integer>> result = new LinkedList<>(); 
        if(root == null){
            return result; 
        }
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size(); 
            List<Integer> levelElements = new LinkedList<Integer>();
            for(int i= 0; i<levelSize; i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                levelElements.add(q.poll().val);
            } 
            result.add(levelElements);
        }
        return result;
    }
}