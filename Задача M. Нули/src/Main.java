import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, x = 0, k = 0;
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(x);
            if (x == 0){
                k++;
            }
        }
        System.out.print(k);
    }
}
