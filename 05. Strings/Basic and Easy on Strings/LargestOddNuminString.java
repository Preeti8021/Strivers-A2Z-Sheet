//logic: iterate from end, and check for odd digit, if present, return substring from index '0', 
// else return empty string
//TC - O(n) SC - O(1)

public class LargestOddNuminString {
    public String largestOddNumber(String num) {
        for(int i = num.length()-1; i>=0; i--){
            int p = Integer.valueOf(num.charAt(i));
            if(p%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}