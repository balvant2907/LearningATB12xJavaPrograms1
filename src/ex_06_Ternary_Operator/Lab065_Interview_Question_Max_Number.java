package ex_06_Ternary_Operator;

public class Lab065_Interview_Question_Max_Number {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        String Max_numner= a > b ? "a is max number" : "b is max number";
        System.out.println(Max_numner);

        System.out.println(Math.max(a,b));
     }
}
