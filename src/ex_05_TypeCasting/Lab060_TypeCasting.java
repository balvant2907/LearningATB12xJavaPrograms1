package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long  l= 9022674792l;
       // short s=f;   //Narrowing implicit
        short s= (short)l; // narrowing Explicit
        System.out.println(s);
    }
}
