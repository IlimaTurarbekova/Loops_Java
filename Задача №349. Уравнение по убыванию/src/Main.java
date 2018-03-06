import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, e;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        for (int i = 1000; i >= 0; i--) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                System.out.println(i + " ");
            }
        }


    }
}
