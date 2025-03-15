package ss7_String;

import java.util.Scanner;

public class btapMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử mảng: ");
        int size = scanner.nextInt();
        int[] n = new int[size];


        for (int i = 0; i < n.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            n[i] = scanner.nextInt();
        }
        boolean isAllEven = true;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 != 0) {
                System.out.println("Mảng không toàn chẳn");
                isAllEven = false;
                break;
            }
        }
        if (isAllEven){
            System.out.println("Mảng toàn chẳn");
        }

    }
}