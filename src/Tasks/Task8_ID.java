package Tasks;

public class Task8_ID {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        int m = i-- - j-- - k--;
        // 1 - 2 - 3
        //
         //0  1  2

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}
