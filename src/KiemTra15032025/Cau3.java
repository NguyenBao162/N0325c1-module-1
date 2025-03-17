package KiemTra15032025;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int countUpperCase = 0;
        if(countUpperCase > 0) {
            System.out.println("m");
        }

    }

      static int calCountUpperCase(String str){
          int count = 0;
          for (int i = 0 ; i < str.length(); i++){
              if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                  count++;
              }
          }
          return count;
        }

}
