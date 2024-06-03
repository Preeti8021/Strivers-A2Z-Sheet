public class Print1toN
{
  int t = 1;    
  public void printNos(int N)
    {
        if(t<=N){
            System.out.print(t+" ");
            t++; 
            printNos(N);
        }
    }
  public static void main(String[] args){
    printNos(5); 
  }
}
