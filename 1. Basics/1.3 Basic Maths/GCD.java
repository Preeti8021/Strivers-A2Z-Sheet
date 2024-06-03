public class GCD {
    static Long[] lcmAndGcd(Long A, Long B) {
        Long[] arr = new Long[2];
        
        arr[1] = GCD(A, B);
        arr[0] = (A*B)/arr[1];
        return arr;
    }

    static Long GCD(Long A, Long B) {
        while (B != 0) {
            Long temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

  public static void main(String[] args){
    System.out.print(lcmAndGcd(5,10)); 
  }
}
