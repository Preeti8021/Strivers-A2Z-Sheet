class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} 
class Tree
{
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> res = new ArrayList<>(); 
        if(root == null){
            return res;
        }
        Stack<Node> s = new Stack<Node>(); 
        s.push(root);
        while(!s.isEmpty()){
            root = s.pop(); 
            res.add(root.data);
            if(root.right != null){
                s.push(root.right);
            }
            if(root.left != null){
                s.push(root.left);
            }
        }
        return res; 
    } 
}