import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        n = 1;
        int count = 0;
        while (n<=m){
            if (IsPalindrom(n)){
                ++count;
            }
            ++n;
        }
        System.out.println(count);
    }

    public static boolean IsPalindrom(int n) {
        int base = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if (base == rev) {
            return true;
        } else {
            return false;
        }
    }
}
