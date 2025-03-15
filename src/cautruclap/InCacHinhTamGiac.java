package cautruclap;

import java.util.Scanner;

public class InCacHinhTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu dai canh hinh vuong ");
        int chieuDaiCanh = scanner.nextInt();
        System.out.println("hinh a");
        for (int i = 1; i <=chieuDaiCanh; i++){
            for (int j = 1; j <= i; j++){
                System.out.println("*");
            }


            System.out.println();
        }
        System.out.println("hinh b");
        for (int i = 1; i <=chieuDaiCanh; i++){
            for (int j = 1; j <= chieuDaiCanh - i + 1; j++){
                System.out.println("*");
            }


            System.out.println();
        }
        System.out.println("hinh c");
        for (int i = 1; i <=chieuDaiCanh; i++){
            for (int j = 1; j <= chieuDaiCanh - i ; j++){
                System.out.println(" ");
            }

            for (int j = 1 ; j <= i; j++ ){
                System.out.println("*");
            }


            System.out.println();
        }

        System.out.println("hinh d");
        for (int i = 1; i <=chieuDaiCanh; i++){
            for (int j = 1; j <= i ; j++){
                System.out.println(" ");
            }

            for (int j = 1 ; j <= chieuDaiCanh - i + 1; j++ ){
                System.out.println("*");
            }


            System.out.println();
        }
    }
}
