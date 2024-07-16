//Logic: use 2 pointers, if first element is less, check if it was the last element added in the 
//arraylist, if not then add to result list

//TC - O(M+N) SC - O(M+N)

public class UnionOfArrays
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0,j=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(result.size() == 0 || result.get(result.size()-1) != arr1[i]){
                    result.add(arr1[i]);
                }
                i++;
            }
            else{
                if(result.size() == 0 || result.get(result.size()-1) != arr2[j]){
                    result.add(arr2[j]);
                }
                j++;
            }
        }
        
        while (i < n) {
            if (!result.contains(arr1[i])) {
                result.add(arr1[i]);
            }
            i++;
        }
        
        while (j < m) {
            if (!result.contains(arr2[j])) {
                result.add(arr2[j]);
            }
            j++;
        }
        return result;
    }
}


//learning- contains() method may take more time to check if element is present in ArrayList 
//(worst case TC - O(N))