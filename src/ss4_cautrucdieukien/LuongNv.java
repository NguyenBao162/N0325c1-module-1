package ss4_cautrucdieukien;

import java.util.Scanner;

public class LuongNv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luongcoban = 650000.0;

        System.out.print("Nhập vào TNCT: ");
        int tnct = scanner.nextInt();
        double heSoLuong;
        if (tnct < 12) {
            heSoLuong = 1.92;
        } else if (tnct < 36){
            heSoLuong = 2.34;
        } else if (tnct < 60){
            heSoLuong = 3.0;
        } else{
            heSoLuong = 4.5;
        }
        double luong = heSoLuong * luongcoban;
        System.out.println("Lương Nhân Viên Là: " + luong);

        scanner.close();
    }
}
