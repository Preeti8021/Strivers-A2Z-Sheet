//left rotate array by one place - store first element in temp, replace the element with next element, last element is temp 
//TC- O(N), SC - O(1) - no extra space, but in the algorithm O(N) - as array is used to solve question 

class LeftRotateArrayByOne{
    public static int[] leftRotateArrayByOne(int[] arr){
        int temp = arr[0];
        for(int i = 1; i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr; 
    }
}

//left rotate array by n places 
//bruteforce - to create a temp array to store the k elements, then shift the other elements to start, finally put the temp elements into array at end (TC- o(N) SC - O(N))
//optimal - reverse the array, then reverse only k elements, and reverse n-k elements (TC - O(2N), SC - O(1))

public class LeftRotateArrayByN{
    public static void reverse(int[] nums, int i, int j) {
        while(i<=j){ 
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static int[] leftRotateArrayByN(int[] arr, int k){
        int n = arr.length-1; 
        k = k % n;
        reverse(arr,0,n);
        reverse(arr,0,n-k);
        reverse(arr,n-k+1,n);
        return arr; 
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int k = 3; 
        leftRotateArrayByN(arr,k);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}