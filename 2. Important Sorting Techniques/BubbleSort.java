//Logic: Push the max to the end with adjacent swaps 
//Time complexity: O(n2)

public class BubbleSort
{
  public static void main(String[] args){
    int[] arr = {5,2,6,8,9};
    int n = 5; 
    bubbleSort(arr,n);
    for(int i = 0; i<n; i++){
      System.out.print(arr[i]+" "); 
    }
  }
	public static void bubbleSort(int arr[], int n)
    {
        for(int i = n-1; i>=1; i--){
            for(int j = 0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp; 
                }
            }
        }
    }
}
