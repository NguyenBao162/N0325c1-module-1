package ss5_cautruclap;

import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        int factorialA, factorialB, factorialC;

        do {
            // Nhập a
            do {
                System.out.print("Nhập số nguyên dương a: ");
                a = scanner.nextInt();
                if (a <= 0) {
                    System.out.println("Bạn cần nhập vào số dương, xin nhập lại!");
                }
            } while (a <= 0);

            // Nhập b
            do {
                System.out.print("Nhập số nguyên dương b: ");
                b = scanner.nextInt();
                if (b <= 0) {
                    System.out.println("Bạn cần nhập vào số dương, xin nhập lại!");
                }
            } while (b <= 0);

            // Nhập c
            do {
                System.out.print("Nhập số nguyên dương c: ");
                c = scanner.nextInt();
                if (c <= 0) {
                    System.out.println("Bạn cần nhập vào số dương, xin nhập lại!");
                }
            } while (c <= 0);

            // Tính giai thừa
            factorialA = 1;
            for (int i = 1; i <= a; i++) {
                factorialA *= i;
            }

            factorialB = 1;
            for (int i = 1; i <= b; i++) {
                factorialB *= i;
            }

            factorialC = 1;
            for (int i = 1; i <= c; i++) {
                factorialC *= i;
            }

            // Tính tổng và in kết quả
            int s = factorialA + factorialB + factorialC;
            System.out.printf("Tổng của %d! + %d! + %d! = %d\n", a, b, c, s);

            // Hỏi người dùng có muốn tiếp tục không
            System.out.print("Bạn có muốn tiếp tục không? (y/n): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("y")) {
                break;
            }

        } while (true);

        scanner.close();
    }
}
