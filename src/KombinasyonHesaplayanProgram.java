import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, r, factorial1 = 1, factorial2 = 1, factorial3 = 1, combination;
        System.out.print("1. Kümenin Eleman Sayısı : ");
        n = input.nextInt();
        System.out.print("2. Kümenin Eleman Sayısı : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial1 *= i;
        }
        for (int j = 1; j <= r; j++) {
            factorial2 *= j;
        }
        for (int k = 1; k <= (n-r); k++) {
            factorial3 *= k;
        }

        combination = factorial1 / (factorial2 * factorial3);

        System.out.print("(" + n + "," + r + ") Kombinasyonu = " + combination);
    }

}
