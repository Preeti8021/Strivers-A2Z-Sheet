//Logic: Inorder traversal of binary search trees is always strictly increasing, hence find if 
//any values is less than the previous value

public class InorderBst {
    static boolean isBSTTraversal(int arr[]) {
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<=arr[i-1]){
                return false;
            }
        }
        return true;
    }
}