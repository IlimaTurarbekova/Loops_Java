import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b, c, d, e;
        a = scanner.nextLong();
        b = scanner.nextLong();
        c = scanner.nextLong();
        d = scanner.nextLong();
        e = scanner.nextLong();
        int k = 0;

        for (int i = 0; i <= 1000; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                if (i - e != 0) {
                    k++;
                }
            }
        }
        System.out.println(k);

    }
}
