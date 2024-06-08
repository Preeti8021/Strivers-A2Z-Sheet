//Logic: Divide and conquer algorithm 
//Time complexity (best,worst,average) : O(nlogn)  [logn - because of division of arrays into halves, n- for merging i.e comparison of elements while merging]
//Space complexity: O(n) - temporary array created in merge method 

public class MergeSort
{
  public static void main(String[] args){
    int[] arr = {4,6,8,9,1}; 
    int n = 5; 
    mergeSort(arr,0,n-1);
    for(int i =0; i<n; i++){
      System.out.print(arr[i]+" "); 
    }
  }
  static void merge(int arr[], int l, int m, int r)
    {
        ArrayList<Integer> a = new ArrayList<>(); 
        int left = l; 
        int right = m+1;
        while(left<=m && right<=r){
            if(arr[left]<arr[right]){
                a.add(arr[left]);
                left++; 
            }
            else{
                a.add(arr[right]);
                right++;
            }
        }
        while(left<=m){
            a.add(arr[left]);
            left++; 
        }
        while(right<=r){
            a.add(arr[right]);
            right++; 
        }
        for(int i = l; i<=r; i++){
            arr[i] = a.get(i-l);
        }
    }
    static void mergeSort(int arr[], int l, int r)
    {
        if(l>=r){
            return; 
        }
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
