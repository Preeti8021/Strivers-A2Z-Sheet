//Logic: Use array to implement stack for basic operations (dealing mostly with the top variable)

import java.io.*;
import java.util.*;

public class StackUsingArrays {
    public static int arr[] = new int[1000];
    public static int top = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //operations
        
        while(n>0){
            String s = sc.next(); 
            switch(s){
                case "Push":
                    int a = sc.nextInt(); 
                    push(a);
                    n--;
                    break;
                case "Pop":
                    if(top>=0){
                        pop();
                    }
                    n--;
                    break;
                case "Print":
                    print();
                    n--;
                    break;
            }
        }   
    }
    
    public static void push(int x) { //push
        top++;
        arr[top] = x; 
    }
    
    public static void pop() { //pop
        top--; 
    }
    
    public static void print(){ //print
        for(int i = 0; i<top+1; i++){
            System.out.println(arr[i]);
        }
    }
    
}