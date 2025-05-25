package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        boolean a=true;
        System.out.println(!a);

        boolean b=false;
        System.out.println(!!b);

        boolean c= true || false;
        boolean d= false && true;
        boolean e= true && false;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
