//Logic: Used Kadane's algorithm which will take O(N) time complexity to solve this question 
//better than O(n^2) approach 

public class MaxSubarraySum {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = -10000000; 
        for(int i= 0; i<nums.length; i++){
            sum = sum + nums[i];
            if(sum>max){
                max =sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}