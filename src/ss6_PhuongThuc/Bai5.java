package ss6_PhuongThuc;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        System.out.println("Phần tử của dãy fibonacci:");
        printsFibonacci(n);

    }

    public static void printsFibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        int fn = 1;
        for (int i = 1; i <= n; i++) {
            System.out.printf(fn + "\t");

            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
}