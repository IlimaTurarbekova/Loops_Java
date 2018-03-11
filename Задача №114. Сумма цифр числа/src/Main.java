import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(SumOfDigits(n));
    }

    public static int SumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;

        }
        return sum;
    }
}