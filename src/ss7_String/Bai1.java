package ss7_String;

import java.util.Scanner;

public class Bai1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String str = "Hello World";
            System.out.println("Chuỗi ban đầu là: " + str);

            System.out.printf("câu a. Lấy ra chữ World: %s", str.substring(6));
            System.out.printf("\ncâu b. Thay o thành f: %s", str.replace('o', 'f' ));

            // cau c
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                //  str.charAt(i) lấy ra ký tự tại vị trí chỉ số i
                if (str.charAt(i) == 'l' ) {
                    count++;
                }
            }
            System.out.print("\nCâu c. Số chữ l trong câu là: " + count);

            // câu d
            System.out.printf("\nCâu d. Vị trí xuất hiện chữ l đầu tiên và cuối cùng trong câu là: %s %s  ", str.indexOf('l' ), str.lastIndexOf('l' ));

            // câu e
            System.out.println("\nCâu e. Xóa hết space giữa chừng đầu tiên và cuối cùng: " + str.replace(" ", ""));

            // câu f
            System.out.println("Câu f. Xóa hết space đầu tiên và cuối cùng: " + str.trim());

            // câu g
            String reversedStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                //  str.charAt(i) lấy ra ký tự tại vị trí chỉ số i
                reversedStr += str.charAt(i);
            }
            System.out.println("Câu g. Đảo chuỗi: " + reversedStr);

            // câu h
            String str1 = "SQC ";
            System.out.println("Câu h. Chuỗi mới: " + str1.concat(str));

            // câu i
            System.out.println("Câu i. Đổi toàn bộ kí tự sang chữ hoa: " + str.toUpperCase());

            // câu k
            System.out.println("Câu i. Đổi toàn bộ kí tự sang chữ thường: " + str.toLowerCase());

            // câu l
            System.out.println("Câu l. Trích ra chuỗi con kí tự từ n đến m: " + str.substring(0, 8));

        }
    }

