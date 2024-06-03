public class SumOfN {
    long sumOfSeries(long n) {
        long sum = (long)Math.pow(n,3) ; 
        if(n==0){
            return sum; 
        }
        sum = sum + sumOfSeries(n-1); 
        return sum; 
    }
  public static void main(String[] args){
    System.out.print(sumOfSeries(5)); 
  }
}
