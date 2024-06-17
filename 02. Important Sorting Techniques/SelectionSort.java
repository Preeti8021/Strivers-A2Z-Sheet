//Logic: get the minimum and swap with element after sorted part 
//Time complexity (best,worst,average): O(N2)

public class SelectionSort
{
  public static void main(String[] args){
    int arr[]= {4 ,1, 3, 9, 7};
    int n = 5; 
    System.out.print(selectionSort(arr,n)); 
  }

	static void selectionSort(int arr[], int n)  
	{   
	    for(int i = 0; i<=n-2; i++){
	        int min = i;
	        for(int j = i; j<n; j++){
	            if(arr[j]<arr[min]){
	                min = j; 
	            }
	        }
	        int temp = arr[i];
	        arr[i] = arr[min];
	        arr[min] = temp; 
	    }
  }
}
