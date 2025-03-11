package ss3_java_overview;

import java.util.Scanner;

public class ChuViDienTichHinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double banKinh = scanner.nextDouble();

        double chuVi = 2 * Math.PI * banKinh;

        double dienTich = Math.PI * Math.pow(banKinh, 2);

        System.out.println("Chu vi hình tròn là: " + chuVi);
        System.out.println("Diện tích hình tròn là: " + dienTich);

        scanner.close();
    }
}
