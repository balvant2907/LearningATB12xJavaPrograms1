package Practice_Tasks;

import java.util.Scanner;

public class Lab003_Person_Able_to_Vote_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a age");
        int age=scanner.nextInt();

        String result= (age >= 18  ) ? "Able to Vote" : "Not able to vote" ;
        System.out.println(result);
    }
}
