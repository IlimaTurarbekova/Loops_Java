import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        long sum = 0;
        System.out.println(n);
        for (int i = 1; i <= n; i++){
            System.out.println(x);
            sum += x;
        }
        System.out.println(sum);
    }
}
