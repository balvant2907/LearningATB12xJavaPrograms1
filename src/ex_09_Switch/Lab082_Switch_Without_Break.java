package ex_09_Switch;

import java.util.Scanner;

public class Lab082_Switch_Without_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number inbetween 1 to 7");
        if (scanner.hasNext()) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("mon");


                case 2:
                    System.out.println("tue");
                case 3:
                    System.out.println("wed");
                case 4:
                    System.out.println("thu");

                case 5:
                    System.out.println("fir");

                case 6:
                    System.out.println("sat");

                case 7:
                    System.out.println("sun");

            }
        }
        else
        {
            System.out.println("ENter a valid number");
        }
    }

}
