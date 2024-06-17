//Logic 
//Bruteforce: Sort the array, and then get the last element as largest. Then check for element just less than that in entire array. [TC- O(nlogn+n) nlogn for sorting the array, n for checking the second largest]
//Better: Find the largest element using max variable, then find the sec largest by keeping condition that the element must be less than the first largest element [TC - O(2n) n for largest, n for sec largest] 
//Best: Maintain two variables, large and seclarge keep updating the two while iterating once. [TC - O(n)]


class SecLargest { //best approach
    public static void main(String[] args){
      int[] arr = {12, 35, 1, 10, 34, 1};
      int n = 6; 
      System.out.print(print2largest(arr,n)); 
    }
    static int print2largest(int arr[], int n) {
        int max = arr[0];
        int sec = -1;
        for(int i = 1; i<n; i++){
            if(arr[i]>max){
                sec = max; 
                max = arr[i];
            }
            if(arr[i]>sec && arr[i]<max){
                sec = arr[i];
            }
        }
        return sec; 
    }
}
