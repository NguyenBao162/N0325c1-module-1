package KiemTra15032025;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử mảng (n <= 20): ");
        int n = scanner.nextInt();

        if (n <= 0 || n > 20) {
            System.out.println("Số lượng phần tử không hợp lệ. Vui lòng nhập lại.");
            scanner.close();
            return;
        }

        int[] mang = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }

        int tongChan = 0;
        int tongLe = 0;

        for (int phanTu : mang) {
            if (phanTu % 2 == 0) {
                tongChan += phanTu;
            } else {
                tongLe += phanTu;
            }
        }

        int hieu = tongChan - tongLe;
        System.out.println("Hiệu của tổng các số chẵn và tổng các số lẻ là: " + hieu);

        scanner.close();
    }
}