package Tasks;

public class Task5_Ternary_Operator3 {
    public static void main(String[] args) {
        //Again, use the nested ternary. You have to figure it out if I am an adult, minor, or senior. What is the condition? The condition is very simple.
        // If my age is greater than 18, then I can be minor or adult or senior. But if my age is greater than 65, then I am a senior.
        // If I am between 18 to 65, then I am an adult.


        int age1=76;


        String result= (age1 <= 18) ?  "Minor" : (age1 >=65 ? "Senior" : "Adult") ;

        System.out.println(result);

    }
}
