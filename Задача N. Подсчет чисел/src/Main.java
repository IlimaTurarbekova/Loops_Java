import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x;
        int zero = 0;
        int pos = 0;
        int neg = 0;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            x = scanner.nextInt();
            if (x == 0) {
                zero++;
            } else if (x > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println(zero + " " + pos + " " + neg);
    }
}
