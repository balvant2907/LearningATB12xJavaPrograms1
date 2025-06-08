package ex_08_If_Condition;

import java.util.Scanner;

public class Lab077_if {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if (age > 18)
        {
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cant vote");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int result= scanner.nextInt();


        if (result > 18)
        {
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cant vote");
        }




    }
}
