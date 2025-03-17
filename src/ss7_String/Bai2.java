package ss7_String;

public class Bai2 {
    public static void main(String[] args) {
        String Str = "1000";

        // câu a
        int a = Integer.parseInt(Str);
        System.out.println(a);

        // câu b
        String b = Integer.toString(a);
        System.out.println(b);

        // câu c
        String cStr = "1231231232131231";
        long c = Long.parseLong(cStr);
        System.out.println(c);

        // câu d
        String d = Long.toString(c);

        // câu e
        String eStr = "2323232332";
        float e = Float.parseFloat(eStr);

        // câu f
        String f = Float.toString(e);

        // câu g
        String gStr ="9.82";
        double g = Double.parseDouble(gStr);

        // câu h
        String h = Double.toString(g);

        // câu i
        String iStr = "100";
        Short i = Short.parseShort(iStr);

        // câu k
        String k = String.valueOf(i);
    }
}
