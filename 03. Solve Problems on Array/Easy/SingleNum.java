//Time Complexity: O(n) 
//Space Complexity: O(1)
//Logic: When we use the XOR operator, two same numbers would result in 0 and 
//finally the single number would be left till end

public class SingleNum {
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i = 0;i<nums.length; i++){
            a = a^nums[i];
        }
        return a; 
    }
}