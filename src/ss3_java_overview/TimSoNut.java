package ss3_java_overview;

import java.util.Scanner;

public class TimSoNut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số xe từ bàn phím.
        System.out.print("Nhập số xe: ");
        int soXe = scanner.nextInt();

        // Bước 2: Tính tổng các chữ số của số xe.
        int tongChuSo = 0;
        int tempSoXe = soXe; // Tạo bản sao để không làm thay đổi số xe gốc

        while (tempSoXe > 0) {
            tongChuSo += tempSoXe % 10; // Lấy chữ số cuối cùng và cộng vào tổng
            tempSoXe /= 10; // Loại bỏ chữ số cuối cùng
        }

        // Bước 3: Tính số nút bằng cách lấy chữ số hàng đơn vị của tổng các chữ số (tổng % 10).
        int soNut = tongChuSo % 10;

        // Bước 4: In ra số nút của biển số xe.
        System.out.println("Số nút của biển số xe là: " + soNut);

        scanner.close();
    }
}
