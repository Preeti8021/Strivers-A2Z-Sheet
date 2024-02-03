import java.util.Scanner;
public class Solution {
	static int fibonacci(int n){ //fibonacci using for loop 
		int first = 1; //first term is 1 
		int second = 1;
		int current = 0;
		if(n==1 || n==2){
			return 1;
		}
		for(int i = 3; i<=n; i++){
      current = first + second;
      first = second;
      second = current;
		}
		return current;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fibonacci(n));
	}
}
