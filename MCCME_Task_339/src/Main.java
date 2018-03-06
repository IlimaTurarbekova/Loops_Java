import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;
        int min_den = 1;
        int sqrt_n = (int) Math.sqrt((double) n);
        while (i <= sqrt_n) {
            if (n % i == 0){
                min_den = i;
                break;
            }
            i++;
        }
        if(min_den == 1){
            System.out.println(n);
        } else {
            System.out.println(min_den);
        }
    }
}
