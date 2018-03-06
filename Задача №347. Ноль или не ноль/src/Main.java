import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x;
        n = scanner.nextInt();
        boolean zeroExist = false;
        for (int i = 1; i <= n; i++) {
            x = scanner.nextInt();
            if (x == 0) {
                zeroExist = true;
                break;
            }
        }
        if (zeroExist) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
