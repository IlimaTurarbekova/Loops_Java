import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int cur = 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(cur + " ");
            count++;
            if (cur == count) {
                cur++;
                count = 0;
            }
        }

    }
}
