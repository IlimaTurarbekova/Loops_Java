import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(MinDigit(n) + " " + MaxDigit(n));
    }

    public static int MinDigit(int n) {
        int cur;
        int min_n = 9;
        while (n > 0) {
            cur = n % 10;
            min_n = Math.min(min_n, cur);
            n /= 10;
        }
        return min_n;
    }

    public static int MaxDigit(int n) {
        int cur;
        int max_n = 0;
        while (n > 0) {
            cur = n % 10;
            max_n = Math.max(max_n, cur);
            n /= 10;
        }
        return max_n;
    }
}
