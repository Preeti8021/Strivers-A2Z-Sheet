//Logic: Take input as string, and split to String array. Use queue to create a tree. 

import java.io.*;
import java.util.*;

class Node{
    int data; 
    Node left, right; 
    Node(int data){
        this.data = data; 
        left = null; 
        right = null; 
    }
}

public class InputBinaryTree
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    Node root = new Node(Integer.parseInt(arr[0]));
    Queue<Node> q = new LinkedList<>(); 
    q.add(root);
    int i = 1; 
    while(i<arr.length){
        Node curr = q.poll(); 
        String left = arr[i];
        if(!left.equals("-1")){
            curr.left = new Node(Integer.parseInt(left));
            q.add(curr.left);
        }
        i++; 
        if(i<arr.length){
            String right = arr[i];
            if(!right.equals("-1")){
                curr.right = new Node(Integer.parseInt(right));
                q.add(curr.right);
            }
        }
        i++;
    }
    inorder(root);
  }
  public static void inorder(Node node){ 
    if(node == null){
        return; 
    }
    inorder(node.left);
    System.out.print(node.data+" ");
    inorder(node.right);
  }
}