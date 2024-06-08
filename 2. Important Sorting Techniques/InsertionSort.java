//Logic: take an element, place it in correct order
//Time Complexity(worst, average): O(N2) 
//Best case: O(N) - when array is sorted then there is no swaps which is inner loop 

public class InsertionSort
{
  public static void main(String[] args){
    int[] arr = {5,2,6,7,1};
    int n = 5; 
    insertionSort(arr,n); 
    for(int i =0; i<n; i++){
      System.out.print(arr[i]+" "); 
    }
  }
  public void insertionSort(int arr[], int n)
  {
      for(int i = 0; i<n; i++){
          int j = i; 
          while(j>0 && arr[j-1]>arr[j]){ //check every prev element- if less than prev - then only swap 
              int temp = arr[j-1];
              arr[j-1] = arr[j];
              arr[j]= temp; 
              j--;
          }
      }
  }
}
