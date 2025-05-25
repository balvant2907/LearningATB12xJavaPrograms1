package Practice_Tasks;

import java.util.Scanner;

public class Lab001_Even_Odd {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Value of i is");
        int i=scanner.nextInt();


        if (i % 2 == 0) {
            System.out.println("its even number");

        } else {
            System.out.println("Its odd number");
        }

    }
}
