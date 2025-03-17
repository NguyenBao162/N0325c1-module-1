package ss6_PhuongThuc;

import java.util.Scanner;

public class Bai2 {


    public class Exercise2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập vào 1 số bất kỳ: ");
            int number = sc.nextInt();

//        int result = resersedNumber(number);
            System.out.println("Số đảo ngược là: " + resersedNumber(number));

            System.out.println("Số đối xứng là: " + isSymmetricalNumber(number));

            if (isSquareNumber(number)) {
                System.out.printf("%d Là một số chính phương\n", number);
            } else {
                System.out.printf("%d Không phải là một số chính phương\n", number);
            }

            if (isPrimeNumber(number)) {
                System.out.printf("%d Là một số nguyên tố\n", number);
            } else {
                System.out.printf("%d Không phải là một số nguyên tố\n", number);
            }

            System.out.println("Tổng các số lẻ là: " + calculateTotalOddDigits(number));

            System.out.println("Tổng các số nguyên tố: " + calculateTotalPrimeDigits(number));

            System.out.println("Tổng các số chính phương: " + calculateTotalSquareDigits(number));


        }

        // số đảo
        public static int resersedNumber(int number) {
            int temp = 0;
            while (number != 0) {
                int digits = number % 10;
                temp = temp * 10 + digits;
                number /= 10;
            }
            return temp;
        }

        // Số đối xứng
        public static boolean isSymmetricalNumber(int number) {
            return number == resersedNumber(number);
        }

        // Số chính phương
        public static boolean isSquareNumber(int number) {
            return Math.sqrt(number) % 1 == 0;
        }

        // Số nguyên tố
        public static boolean isPrimeNumber(int number) {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        // Tổng các số lẻ
        public static int calculateTotalOddDigits(int number) {
            int sum = 0;
            while (number != 0) {
                int digit = number % 10;
                if (digit % 2 != 0) {
                    sum += digit;
                }
                number /= 10;
            }
            return sum;
        }

        // Tổng các số nguyên tố
        public static int calculateTotalPrimeDigits(int number) {
            int sum = 0;
            while (number != 0) {
                int digit = number % 10;
                if (isPrimeNumber(digit) && digit != 1) {
                    sum += digit;
                }
                number /= 10;
            }
            return sum;
        }

        // Tổng các số chính phương
        public static int calculateTotalSquareDigits(int number) {
            int sum = 0;
            while (number != 0) {
                int digit = number % 10;
                if (isSquareNumber(digit)) {
                    sum += digit;
                }
                number /= 10;
            }
            return sum;
        }
    }
}
