public class LargestInArray {
    public static void main(String[] args){
      int[] arr = {1, 8, 7, 56, 90};
      int n = 5; 
      System.out.print(largest(arr,n)); 
    }
    public int largest(int arr[], int n)
    {
        int max = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max; 
    }
}
