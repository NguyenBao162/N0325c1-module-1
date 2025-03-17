package ss4_cautrucdieukien;

public class TinhBoolean {
    public static void main(String[] args) {
        boolean a = true && false;  // (And) true và false --> false
        boolean b = (3 > 100) || (25 % 5 == 0); // (Or) false và true --> true
        boolean c = a && b;
        boolean d = !a || b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
