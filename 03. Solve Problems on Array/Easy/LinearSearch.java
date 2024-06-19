//Time complexity: O(n)
//search entire array to find if element is present or not 
public class LinearSearch{
    static int search(int arr[], int N, int K)
    {
       for(int i = 0; i<N; i++){
           if(arr[i]==K){
               return 1; 
           }
       }
       return -1; 
    }
    public static void main(String[] args){
      int[] arr = {2,4,5,6,7}; 
      int N = 5; 
      int K = 2; 
      System.out.print(search(arr,N,K)); 
    }
}
