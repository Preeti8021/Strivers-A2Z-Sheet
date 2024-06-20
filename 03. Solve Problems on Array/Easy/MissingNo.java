public class MissingNo {
    //Time Complexity: O(N2)
    public static int missingNumber1(int[] nums) {
        int max = nums.length;
        for (int i = 0; i <= max; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return i;
            }
        }
        return -1;
    }

    //Time complexity: O(N) sum of n terms - sum of all nums in array
    public static int missingNumber1(int[] nums){
      int n = nums.length; 
      int sumofn = n * (n-1) /2; 
      int sumnums =0; 
      for(int i = 0; i<n; i++){
        sumnums = nums[i] + sumnums; 
      }
      return sumofn - sumnums; 
    }

    public static void main(String[] args){
      int[] nums = {3,0,1};
      System.out.println(missingNumber1(nums)); 
      System.out.println(missingNumber2(nums)); 
      //both results in same value
    }
}

//Other methods
/*
2.Sorting:
Time Complexity: O(nlogn) (due to sorting) + O(n) (iterating through the array)
Space Complexity: O(1)
Sort the array and then iterate through it to find the missing number.

3.HashSet:
Time Complexity: O(n)
Space Complexity: O(n)
Use a HashSet to store the array elements and then iterates through the array to find the missing number.

4.XOR (Bit Manipulation):
Time Complexity: O(n)
Space Complexity: O(1)
Utilize XOR operation to find the missing number without requiring extra space.
*/
