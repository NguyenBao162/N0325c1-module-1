package ss3_java_overview;

public class TimGiaTriBien {
    public static void main(String[] args) {
        int i = 1, j = 1;
        int a = i++ + j++;
        // câu a: i,j tăng lên sau
        //        a = 1 + 1 = 2
        //        i = 2, j = 2

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i++ + j++ = " + a);

        // câu b:  int a = i++ + ++j;
        //         i tăng lên sau, j tăng lên trước
        //         a = 1 + 2 = 3
        //         i = 2, j = 2

        // câu c:  int a = ++i + j++;
        //         i tăng trước, j tăng sau
        //         a = 2 + 1 = 3
        //         i = 2, j = 2

        // câu d:  int a = ++i + ++j;
        //         i tăng trước, j tăng trước
        //         a = 2 + 2 = 4
        //         i = 2, j = 2

        // câu e:  int a = i++ + j++ + i++ + j++;
        //         i tăng sau, j tăng sau,
        //         a = 1 + 1 + 2 + 2 = 6
        //         i = 3, j = 3

        // câu f:  int a = i++ + j++ + i++ + j++;
        //         i tăng sau, j tăng sau
        //         a = 1 + 1 + 2 + 2 = 6
        //         i = 3, j = 3

        // câu g:  int a = ++i + ++j + i++ + j++;
        //         i tăng trước, j tăng trước, i tăng sau, j tăng sau
        //         a = 2 + 2 + 2 + 2 = 8
        //         i = 4, j = 4

        // câu h:  i = 1
        //         int a = i++ + ++i - i-- - --i;
        //         i tăng sau, j tăng trước, i giảm sau, j giảm trước
        //         a = 1 + 3 - 3 - 1 = 0
        //         i = 1

        //Tổng :
        // int a = 10
        // int a += a++ + ++a;
        // a = a + a++ + ++a
        // a = 10 + 10 + 12 = 32
        // a = 12
    }
}
