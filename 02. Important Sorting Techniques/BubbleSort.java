//Logic: Push the max to the end with adjacent swaps 
//Time complexity(worst, average) : O(n2)
//Time complexity(best case): O(n) - if already the array is sorted then no need to check after first iteration of checking the entire array for swaps, if no swap, then break out from loop 

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
		//boolean noswap = true; 
		for(int i = n-1; i>=1; i--){
			for(int j = 0; j<i; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp; 
					//noswap = false; 
				}
			}
			// if(noswap){
			// 	break;
			// }
		}
	}
}
