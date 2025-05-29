package ex_06_Ternary_Operator;

public class Lab064_Interview_Question {
    public static void main(String[] args) {
        //Nested ternary operator
        //result=condition1 ? expression1 : (condition2 ? expression 2 : expression 3)

        int age=19;
        String result= (age > 18) ?  (age > 21 ? "You can drink" : "You cant drink") :"You cant go to Goa";
        System.out.println(result);
    }
}
