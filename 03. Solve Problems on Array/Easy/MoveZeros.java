//Logic: 
//Bruteforce - take new data structure to store the non-zero elements and put zeros at end (tc - O(2N) sc - O(N))
//Optimal - 2 pointers, if i is 0, and j is non zero, then swap (tc- O(N) sc - O(1))

// Optimal Code - 2 pointer approach
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i = 0; 
        for(int j = 1 ; j<nums.length; j++){
            if(i<nums.length && nums[i]==0){
                if(nums[j]!=0){
                    //swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
            else{
                i++;
            }
        }
    }
}
