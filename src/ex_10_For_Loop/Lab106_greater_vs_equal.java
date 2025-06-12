package ex_10_For_Loop;

public class Lab106_greater_vs_equal {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++){
            System.out.println(i);  //0 t0 10 11 times
        }
        for (int i=1; i<=10; i++){
            System.out.println(i);  //1 t0 10 10 times
        }
        for (int i=0; i<10;i++)
        {
            System.out.println(i);  //0 t0 9 10 times
        }
    }

}
