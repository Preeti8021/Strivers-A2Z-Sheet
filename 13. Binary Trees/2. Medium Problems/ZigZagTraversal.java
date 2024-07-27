//Logic: Same as level order, but keep track of level number and reverse and add the level if even 

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

public class ZigZagTraversal {
    public List<Integer> reverse(List<Integer> list){
        List<Integer> reversed = new ArrayList<>();
        for(int i = list.size()-1; i>=0; i--){
            reversed.add(list.get(i));
        }
        return reversed; 
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res; 
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0; 
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> levelElements = new ArrayList<>();
            for(int i = 0; i<levelSize; i++){
                TreeNode curr = q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                levelElements.add(curr.val);
            }
            level++;
            if(level%2==0){
                List<Integer> rev = reverse(levelElements);
                res.add(rev);
            }
            else{
                res.add(levelElements);
            }
        }
        return res; 
    }
}