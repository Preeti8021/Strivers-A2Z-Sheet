//Logic: 
//O(n) tc and O(n) sc - we can create a new array and update the array according to the k value
//O(n) tc and O(1) sc - we can reverse the array, then reverse k places at first and n-k places next (inplace) 

public class RightRotateArray {
    public void rotate(int[] nums, int k) {
        int i = 0, j = nums.length-1;
        k = k % nums.length;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        
        int p = 0; 
        int q = k-1; 
        while(p<=q){
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
            p++;
            q--;
        }

        int r = k; 
        int s = nums.length-1; 
        while(r<=s){
            int temp = nums[r];
            nums[r] = nums[s];
            nums[s] = temp;
            r++;
            s--;
        }
    }
}
