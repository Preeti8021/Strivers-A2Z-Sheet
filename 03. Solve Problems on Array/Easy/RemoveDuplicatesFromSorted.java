//Logic: 
//Bruteforce - use set to keep unique elements, and return size + 1
//Optimal - two pointers, placing unique elements at the start and returning the length of the modified array with unique elements

public class RemoveDuplicatesFromSorted {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != nums[p]){
                nums[++p] = nums[i];
            }
        }
        return p+1; 
    }
}
