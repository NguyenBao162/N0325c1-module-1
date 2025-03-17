package ss4_cautrucdieukien;

import java.util.Scanner;

public class DaoGiaTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào Số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào Số b: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Giá Trị của a sau khi đảo: " + a);
        System.out.println("Giá Trị của b sau khi đảo: " + b);
    }
}
