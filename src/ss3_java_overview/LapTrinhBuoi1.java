package ss3_java_overview;

import java.util.Scanner;

public class LapTrinhBuoi1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //dạng kiểu dữ liệu nguyên thuỷ
        //Số Nguyên
        int a = 111;
        System.out.println(a);
        //Số Thực
        double b = 1111;
        System.out.println(b);
        //Giá Trị Logic
        boolean isValid = false;
        System.out.println((double) 5.0 / 2);
        //Ký Tự
        char c = 'h';
        System.out.println(c);
        //Tham Chiếu
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi của bạn: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Tuổi của bạn là: " + age);
        System.out.println("Tên của bạn là: " + name);
        //bài tập về in ra kiểu số nguyên
        int d = 5;
        int f = 6;

        //5 + 6 = 11
        System.out.println(d + " + " + f + " = " + (d+f));
        System.out.printf("%d + %d = %d", d, f, d + f);
    }
}