import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= 100; i++){
            System.out.println(x);
            sum += x;
        }
        System.out.println(sum);
    }
}
