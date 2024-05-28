public class PrintNtimes {
    void printGfg(int N) {
        if(N==0){
            return; 
        }
        System.out.print("GFG ");
        printGfg(N-1);
    }
  public static void main(String[] args){
    printGfg(5);  //uses recursion 
  }
}
