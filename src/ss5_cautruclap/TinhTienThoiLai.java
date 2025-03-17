package ss5_cautruclap;

import java.util.Scanner;

public class TinhTienThoiLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá món đồ: ");
        int giaMonDo = scanner.nextInt();
        System.out.print("Nhập số tiền khách hàng trả: ");
        int tienKhachHangTra = scanner.nextInt();

        if (tienKhachHangTra < giaMonDo) {
            System.out.println("Khách hàng trả không đủ tiền.");
            return;
        }

        int tienThoiLai = tienKhachHangTra - giaMonDo;
        int[] menhGia = {500000, 200000, 100000, 50000, 20000, 10000, 5000, 2000, 1000};

        for (int menh : menhGia) {
            if (tienThoiLai >= menh) {
                int soTo = tienThoiLai / menh;
                System.out.printf("%d tờ %d\n", soTo, menh);
                tienThoiLai %= menh;
            }
        }

        if (tienThoiLai > 0) {
            System.out.println("Số tiền còn lại: " + tienThoiLai);
        }
    }
}