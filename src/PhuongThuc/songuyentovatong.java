package PhuongThuc;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class songuyentovatong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào n: ");
//        int n = scanner.nextInt();
//        if (isPrimeNumber(n)) {
//            System.out.printf("%d là số nguyên tố\n ", n);
//        } else {
//            System.out.printf("%d không phải là số nguyên tố\n ", n); // hàm in ra tổng
//        }
//        System.out.println("tổng cac so ngto la " + calTotalPrime(n)); // hàm in ra tổng các chữ số ngtố
//        System.out.println("nhap mot ky tu: ");
//        char character = toLowerCase(scanner.nextLine().charAt(0));
//        System.out.println("Gia tri sau khi thay doi: " + character);
//        System.out.print("nhap vao a");
//        double a = scanner.nextDouble();
//        System.out.print("nhap vao b");
//        double b = scanner.nextDouble();
//        System.out.print("");
//        levelOne(a,b);
//        System.out.print("nhap vao a ");
//        double a = scanner.nextDouble();
//        System.out.print("nhap vao b ");
//        double b = scanner.nextDouble();
//        System.out.print("nhap vao c ");
//        double c = scanner.nextDouble();
//        System.out.println();
//        leveltwo(a,b,c);


    }


    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calTotalPrime(int n) {
        int total = 0;
        while (n != 0) {
            if (isPrimeNumber(n % 10)) {
                total += n % 10;
            }
            n /= 10;
        }
        return total;
    }

    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }

    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("nghiem cua phuong trinh la " + x);
        }
    }

    public static void leveltwo(double a, double b, double c) {
        if (a == 0) {
            levelOne(b, c);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("phuong trinh co nghiem x la " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiệm của phương trình là x1 = " + x1 + " và x2 = " + x2);
            }

        }
    }

}
