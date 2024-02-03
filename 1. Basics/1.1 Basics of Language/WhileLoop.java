//Question: Return sum of even and odd digits in a number using while loop
import java.util.Scanner;
public class Main {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even = 0; 
		int odd = 0; 
		while(n>0){
			int temp = n%10;
			if(temp%2==0){
				even+=temp;
			}
			else{
				odd+=temp;
			}
			n = n/10;
		}
		System.out.print(even+" "+odd);
	}
}
