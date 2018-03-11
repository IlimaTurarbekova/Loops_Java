import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(NumberOfZeroes(n));
    }

    public static int NumberOfZeroes(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 0) {
                ++count;
            }
            n /= 10;
        }
        return count;
    }
}