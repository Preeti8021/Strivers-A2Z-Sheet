//Logic: (question says positives = negatives)

//1. Bruteforce - create 2 arrays/lists to store neg and pos elements, then put elements from 
//pos list if index even, neg list if index odd, return array (tc- O(N+N)=O(N) sc- O(N))


//2. Optimal approach - create one array, use 2 pointers for pos and neg to update elements 
//alteratively (tc - O(N) sc - O(N))

public class RearrangePosNeg {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int pos =0 , neg = 1; 
        for(int i = 0; i<nums.length ;i++){
            if(nums[i]>=0){
                arr[pos] = nums[i];
                pos += 2; 
            }
            else{
                arr[neg] = nums[i];
                neg += 2; 
            }
        }
        return arr;
    }
}