//Logic: Using dutch national flag algorithm - use three pointers low mid high, mid is traversing and compare 
//if mid is 0, swap with low, and increment both low, mid
//if mid is 1, just increment mid
//if mid is 2, swap with high and decrement high 
//0's till low-1, 1's till high-1

public class SortZerosOnesTwos {
    public void sortColors(int[] nums) {
        //dutch national algorithm 
        int low = 0, mid = 0, high = nums.length-1; 
        while(mid<=high){
            switch(nums[mid]){
                case 0: 
                    int temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;  
                    low++; 
                    mid++; 
                    break;
                case 1: 
                    mid++; 
                    break;
                case 2: 
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp; 
                    high--; 
                    break;
            }
        }
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}