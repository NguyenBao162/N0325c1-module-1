package cautruclap;

import java.util.Scanner;

public class TinhTongVaTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập M: ");
        int m = scanner.nextInt();
        int s = 0;
        int p = 1;
        while (m > 0){
            int digit = m % 10;
            s = s + digit ;
            p = p * digit;
            m /= 10;
        }
        System.out.println("Tổng các chữ số là : " + s);
        System.out.println("Tích các chữ số là : " + p);
    }
}
