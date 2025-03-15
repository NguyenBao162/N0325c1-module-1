package ss7_String;

import java.util.Scanner;

public  class ss7_string {
    public static void main(String[] args) {
        String str1 = "hello word ";
        String str2 = "hello ";
        String str3 = new String("hello word ");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }


}
