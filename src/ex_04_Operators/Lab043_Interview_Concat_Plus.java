package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name="Balwant";
        String last_name="Wangikar";

        int a=10;
        int b=20;

        System.out.println("first_name+last_name");
        System.out.println(first_name+last_name);
        System.out.println(a+b);
        System.out.println("a+b");
        System.out.println(first_name+last_name+a+b);
        System.out.println(a+b+first_name+last_name);
        System.out.println(first_name+last_name+(a+b)); //Bodmas principle

    }
}
