import java.io.*;
import java.util.*;

class Node{
    int data; 
    Node left,right;
    Node(int data){
        this.data = data; 
        left = null;
        right = null;
    }
}
public class RightView {
    public static void rightView(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            for(int i = 0; i<levelSize; i++){
                Node curr = q.poll();
                if(i==levelSize-1){
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        Node root= new Node(Integer.parseInt(a[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1; 
        while(i<a.length){
            Node curr = q.poll();
            String left = a[i];
            if(!left.equals("-1")){
                curr.left = new Node(Integer.parseInt(left));
                q.add(curr.left);
            }
            i++;
            if(i<a.length){
                String right = a[i];
                if(!right.equals("-1")){
                    curr.right = new Node(Integer.parseInt(right));
                    q.add(curr.right);
                }
            }
            i++;
        }
        rightView(root);
    }
}