import java.util.*; 
class Node{
    int val; 
    Node left; 
    Node right; 
    Node(int val){
        this.val = val; 
        left = null; 
        right = null; 
    }
}
public class Solution{
    public static void createTree(Node root0, ArrayList<Integer> v ){
        root0.left = new Node(v.get(1));
        root0.right = new Node(v.get(2));
        root0.left.left = new Node(v.get(3));
        root0.left.right = new Node(v.get(4));
        root0.right.left = new Node(v.get(5));
        root0.right.right = new Node(v.get(6));
    }
}
public class BinaryTreeRepresentation{
    public static void traverseInorder(Node temp, ArrayList<Integer> inorder){
        if(temp!=null){
            traverseInorder(temp.left, inorder);
            inorder.add(temp.val);
            traverseInorder(temp.right,inorder);
        }
        return; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> v = new ArrayList<>(); 
        for(int i = 0; i<7 ;i++){
            int x = sc.nextInt(); 
            v.add(x);
        }
        Node root = new Node(v.get(0));
        root.left = new Node(v.get(1));
        root.right = new Node(v.get(2));
        root.left.left = new Node(v.get(3));
        root.left.right = new Node(v.get(4));
        root.right.left = new Node(v.get(5));
        root.right.right = new Node(v.get(6));


        Node root0 = new Node(v.get(0));
        Solution obj = new Solution(); 
        obj.createTree(root0,v);

        ArrayList<Integer> a = new ArrayList<>(); 
        traverseInorder(root0,a);

        ArrayList<Integer> b = new ArrayList<>(); 
        traverseInorder(root,b);

        if(a.equals(b)){
            System.out.print(1);
        }
        else{
            System.out.print(-1);
        }
    }
}