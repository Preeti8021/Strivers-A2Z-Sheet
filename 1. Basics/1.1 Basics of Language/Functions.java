import java.util.Scanner;

public class Main {
    public static int maximum(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test, a, b, r;
        test = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();

        switch (test) {
            case 1:
                r = maximum(a, b);
                System.out.println(r);
                break;
            case 2:
                int[] arr = {a, b};
                swap(arr);
                System.out.println(arr[0] + " " + arr[1]);
                break;
            default:
                System.out.println("Invalid test option");
        }
    }
}

