package ex_05_TypeCasting;

public class Lab061_TypeCasting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;

        //int total= course+GST;   // Narrowing implicit
        int total = course + (int) GST; // Narrowing explicit

        System.out.println(total);


        float total2 = course + GST;   //widening implicit

        System.out.println(total2);
    }
}
