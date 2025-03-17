package ss7_String;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();

        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();

        int result = a.compareTo(b);

        if (result == 0) {
            System.out.println("Hai chuỗi giống nhau");
        } else if (result < 0) {
            System.out.println("a đứng trước b trong từ điển");
        } else {
            System.out.println("b đứng trước a trong từ điển");
        }
    }
}
