package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int a=129;
       // byte b=a;   // narrowing-implicit-its not possible as byte can store number upto 127
        byte b= (byte)a;  //narrowing-explicit its called as narrowing we are reducing the memory
        System.out.println(b);

    }
}
