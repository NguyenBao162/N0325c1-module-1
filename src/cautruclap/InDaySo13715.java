package cautruclap;

import java.util.Scanner;

public class InDaySo13715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int a = 1;
        while (a <= n) {
            System.out.println(a + "");

            a = 2 * a + 1;
        }
    }
}
