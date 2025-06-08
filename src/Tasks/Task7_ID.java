package Tasks;

public class Task7_ID {
    public static void main(String[] args) {
        int a = 11;
        int b= 22;
        int c;

        c= a+b +a++ +b++ + ++a + ++b;

        //33 + 11 + 22 + 13 + 24
        //103

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
