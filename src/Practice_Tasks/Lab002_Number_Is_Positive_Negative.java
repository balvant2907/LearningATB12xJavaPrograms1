package Practice_Tasks;

import java.util.Scanner;

public class Lab002_Number_Is_Positive_Negative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scanner.nextInt();

        //Number is positive,negative or zero

        String result= (number > 0 ) ? "its positive number" : (number < 0 ? "its negative number" : "its zero number")  ;
        System.out.println(result);

    }
}
