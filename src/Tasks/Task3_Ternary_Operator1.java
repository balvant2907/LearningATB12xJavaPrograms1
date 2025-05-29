package Tasks;

import java.util.Scanner;

public class Task3_Ternary_Operator1 {
    public static void main(String[] args) {
     //The ternary operator and let me know if I give you a number. Let me know if it is even or odd.

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number");
        int number= scanner.nextInt();

        String result = number %2 ==0 ? "Is a even number " : "Is a odd number";
        System.out.println(result);






    }
}
