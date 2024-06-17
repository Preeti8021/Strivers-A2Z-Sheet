public class ReverseNum {
  //logic
    public int reverse(int x) {
        long result = 0; 
        while(x!=0){
            result = result*10 + (x%10);
            x = x/10; 
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            result = 0;
        }
        if(x<0){
            return (int) result*-1;
        }
        return (int) result;
    }
  public static void main(String[] args){
    int a = 123; 
    System.out.print(reverse(a));
  }
 }
