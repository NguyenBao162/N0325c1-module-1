package ss3_java_overview;

import java.util.Scanner;

public class TongHieuTichThuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số b: ");
        int b = scanner.nextInt();

        int Tong = a + b;
        int Hieu = a - b;
        int Tich = a * b;
        int Thuong = a / b;

        System.out.println("Tổng a và b là: " + Tong);
        System.out.println("Hiệu a và b là: " + Hieu);
        System.out.println("Tích a và b là: " + Tich);
        System.out.println("Thương a và b là: " + Thuong);
    }
}
