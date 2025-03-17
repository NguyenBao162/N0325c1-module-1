package ss5_cautruclap;

import java.util.Scanner;

public class UCLNvaBCNN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b: ");
        int b = scanner.nextInt();

        int ucln = 1;
        for (int i = a; i >= 1; i --){
            if (a % i == 0 && b % i == 0){
               ucln = i;
               break;
            }
        }
        int bcnn;
        for (int i = a; true; i ++){
            if (i % a == 0 && b == 0){
                bcnn = i;
                break;
            }
        }
        System.out.println("UCLN cua " + a + " và " + b + " là " + ucln);
        System.out.println("BCNN cua " + a + " và " + b + " là " + bcnn);
    }
}
