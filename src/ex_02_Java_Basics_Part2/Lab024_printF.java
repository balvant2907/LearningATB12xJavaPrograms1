package ex_02_Java_Basics_Part2;

public class Lab024_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.printf("Your valiable value %d", a);
        //%d -> int,byte,long,short
        //%s -> String
        //%f -> float,double
        //%b -> boolean

        String city="Pune";
        System.out.println();
        System.out.printf("Your variable value %s", city);
        float d=1.23f;
        System.out.println();
        System.out.printf("Your value is %f",d);
        boolean b=false;
        System.out.println();
        System.out.printf("Your value is %b",b);



    }
}
