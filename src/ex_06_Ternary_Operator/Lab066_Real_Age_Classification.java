package ex_06_Ternary_Operator;

public class Lab066_Real_Age_Classification {
    public static void main(String[] args) {

        String user_input= args[0];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);
        int age= Integer.parseInt(user_input);
        System.out.println(age);

        String result= (age < 17) ? "Minor" : (age < 65) ? "Adult" : "Senior citizen";
        System.out.println(result);
    }
}
