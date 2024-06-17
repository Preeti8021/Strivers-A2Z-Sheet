public class ArmstrongNum{
    static String armstrongNumber(int n){
        int temp = n;
        int count = 0; 
        while(temp!=0){
            int rem = temp%10; 
            int x = (int)Math.pow(rem,3); //Math.pow returns double by default
            count = count+ x;
            temp = temp/10; 
        }
        if(count == n){
            return "Yes";
        }
        else{
            return "No";
        }
    }
  public static void main(String[] args){
    int a = 153; 
    System.out.print(armstrongNumber(a)); //prints Yes 
  }
}
