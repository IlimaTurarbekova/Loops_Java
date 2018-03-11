import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(reverse(n));
    }

    public static int reverse(int n) {
        int rev = 0;
        do {
            rev = rev * 10 + n % 10;
            n /= 10;
        } while (n > 0);
        return rev;
    }

}
