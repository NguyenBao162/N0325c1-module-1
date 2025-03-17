package ss6_PhuongThuc;

import java.util.Scanner;

public class Bai3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương n: ");
        int n = sc.nextInt();

        System.out.printf("Câu a: S = 1 + 2 + ... + %d = %d\n", n, calculateSumOfIntegers(n));

        System.out.printf("Câu b: S = 1^2 + 2^2 + ... + %d^2 = %d\n", n, calculateSumOfSquares(n));

        System.out.printf("Câu c: S = 1 + 1/2+ ... + 1/%d = %.2f\n", n, calculateSum(n));

        System.out.printf("Câu d: S = 1 * 2 * ... * %d = %d\n", n, calculateFactorial(n));

        System.out.printf("Câu e: S = 1! + 2! + ... + %d! = %d\n", n, calculateFactorialSum(n));


    }

    // cau a
    public static int calculateSumOfIntegers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // cau b
    public static int calculateSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    // cau c
    public static double calculateSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // cau d
    public static long calculateFactorial(int n) {
        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    // cau e
    public static long calculateFactorialSum(int n) {
        int sum = 1;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }
        return sum;
    }
}


