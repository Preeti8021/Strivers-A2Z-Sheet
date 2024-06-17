public class CountDigits{
    static int evenlyDivides(int N){
        int count = 0; 
        int temp = N; 
        while(temp!=0){
            int rem = temp%10;
            if( rem!=0 && N%rem==0){
                count++; 
            }
            temp = temp/10; 
        }
        return count; 
    }
  public static void main(String[] args){
    int a = 12; 
    System.out.print(evenlyDivides(a)); //output is 2 (both 1,2 divides 12)
  }
 }
