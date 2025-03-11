package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm sinh của bạn: ");
        int year = scanner.nextInt();
        int age = Year.now().getValue() - year;

        System.out.println("Tuổi của bạn là: " + age);
    }
}
