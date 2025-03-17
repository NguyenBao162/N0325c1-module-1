package PhuongThuc;

import java.util.Scanner;

public class Bai4 {


    public class Exercise4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập a: ");
            int a = sc.nextInt();

            System.out.print("Nhập b: ");
            int b = sc.nextInt();

            System.out.printf("USCLN của %d và %d là: %d ",a,b,USCLN(a,b));
        }

        public static int USCLN(int a, int b) {
            int Max = Math.max(a, b);
            int Min = Math.min(a, b);

            if (Max % Min == 0) {
                return Min;
            }

            for (int i = Min / 2; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    return i;
                }
            }
            return 1;
        }
    }
}
