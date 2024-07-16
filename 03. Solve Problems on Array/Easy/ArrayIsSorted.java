//Logic: Traverse array and check if prev element is greater than current, if yes then return false
//if reached till end then return true

public class ArrayIsSorted{
    public boolean arraySortedOrNot(List<Integer> arr) {
        for(int i = 1 ;i<arr.size(); i++){
            if(arr.get(i)<arr.get(i-1)){
                return false;
            }
        }
        return true;
    }
}