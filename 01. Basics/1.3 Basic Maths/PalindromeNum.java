public class PalindromeNum {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false; 
        }
        int temp = x; 
        int sum = 0; 
        while(x!=0){
            int rem = x%10; 
            sum = sum * 10 + rem;
            x= x/10; 
        }
        if(sum==temp){
            return true; 
        }
        else{
            return false;
        }   
    }
  public static void main(String[] args){
    int a = 123; 
    System.out.print(isPalindrome(a)); //prints false
  }
 }
