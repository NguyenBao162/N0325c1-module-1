package ss7_String;

public class ChangeDataMang {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + "\t");
        }
    }

     static void changeData (int[] arr){
        arr[1] = 100;
        arr = new int[]{8, 8, 8};
        arr[1]= 200;
     }
}
