import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int k = 0;
        x = scanner.nextInt();

        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                k++;
            }
        }
        System.out.println(k);
    }
}
