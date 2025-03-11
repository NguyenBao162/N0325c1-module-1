package ss3_java_overview;

import java.util.Scanner;

public class TinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn Toán: ");
        double diemToan = scanner.nextDouble();
        System.out.print("Nhập hệ số môn Toán: ");
        double heSoToan = scanner.nextDouble();

        System.out.print("Nhập điểm môn Lý: ");
        double diemLy = scanner.nextDouble();
        System.out.print("Nhập hệ số môn Lý: ");
        double heSoLy = scanner.nextDouble();

        System.out.print("Nhập điểm môn Hóa: ");
        double diemHoa = scanner.nextDouble();
        System.out.print("Nhập hệ số môn Hóa: ");
        double heSoHoa = scanner.nextDouble();

        double tongDiem = diemToan * heSoToan + diemLy * heSoLy + diemHoa * heSoHoa;
        double tongHeSo = heSoToan + heSoLy + heSoHoa;
        double diemTrungBinh = tongDiem / tongHeSo;

        System.out.println("Điểm trung bình của bạn là: " + diemTrungBinh);

        scanner.close();
    }
}