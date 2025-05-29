package Tasks;

public class Task4_Ternary_Operator2 {
    public static void main(String[] args) {
        //Use the ternary operator, nested ternary operator.
        // If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.

         int N1=20;
         int N2=21;
         int N3=22;



         String result = (N1 > N2) ? "N1 is Max Number" : (N2 > N3) ? "N2 is Max Number" : "N3 is Max Numner";

        System.out.println(result);

        // N1 > N2 or N2 > N3  or N1 > N3

    }
}
