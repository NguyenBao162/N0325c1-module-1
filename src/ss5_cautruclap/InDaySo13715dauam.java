package ss5_cautruclap;

import java.util.Scanner;

public class InDaySo13715dauam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int a = 1;
        int d = 1;
        while (a <= n) {
            System.out.println(a * d + "");

            a = 2 * a + 1;
            d = -d;
        }


    }

}
