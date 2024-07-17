//Logic: use a while loop to iterate through all elements, if finds 1, increase count, update maximum 
//result found, if we found '0' that breaks the continuity, update the count to 0 and increment iterator

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length; 
        int res= 0; 
        int count= 0; 
        int i = 0; 
        while(i<n){
            if(nums[i]==1){
                count++;
                res = Math.max(count,res);
            }
            else{
                count = 0; 
            }
            i++;
        }
        return res; 
    }
}