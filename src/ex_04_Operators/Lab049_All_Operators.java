package ex_04_Operators;

public class Lab049_All_Operators {
    public static void main(String[] args) {
        boolean b = true;
        int a=10;
        int c=20;

        System.out.println(a+c);
        System.out.println(a>c);
        System.out.println(a==c);
        System.out.println(!(a<=c));
        System.out.println(a<c);

        //Compound Assignment Operator

        int age = 10;
        age += age;
        age /=age;
        System.out.println(age);
    }
}
