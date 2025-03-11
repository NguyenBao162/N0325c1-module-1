package ss3_java_overview;

import java.util.Scanner;

public class TinhTienThueVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Tên Sản Phẩm: ");
        String name = scanner.nextLine();

        System.out.print("Số Lượng: ");
        int soluong = scanner.nextInt();

        System.out.print("Đơn Giá: ");
        double dongia = scanner.nextInt();

        int TongTien = (int) (soluong * dongia);
        double ThueVAT = (double) (TongTien * 0.1);

        System.out.println("Tên Sản Phẩm: " + name);
        System.out.println("Tổng Tiền: " + TongTien);
        System.out.println("Thuế VAT Phải Trả : " + ThueVAT);
    }
}
