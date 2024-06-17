//uses recursion concept to find the power of a number 

public class Pow {
    public static void main(String[] args){
      x = 2.00000; 
      n = 10; 
      System.out.print(myPow(x,n)); 
    }
    public static double myPow(double x, int n) {
        if(n==1){
            return x;
        }
        
        double power = 1;
        
        while(n>0){ 
            power =  power * myPow(x,n-1);
        }

        return power;
    }
}
