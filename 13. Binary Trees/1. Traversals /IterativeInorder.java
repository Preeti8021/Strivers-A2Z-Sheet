
/* 
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution
{
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>(); 
        Stack<Node> s = new Stack<>(); 
        Node n = root; 
        while(true){
            if(n != null){
                s.push(n);
                n = n.left; 
            }
            else{
                if(s.isEmpty()){
                  break;
                }
                else{
                    n = s.pop();
                    list.add(n.data);
                    n = n.right; 
                }
            }
        }
        return list;
    }
}