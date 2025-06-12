package Tasks;

import java.util.Scanner;

public class Task9_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        System.out.println("Enter a year");
        int year = scanner.nextInt();

        int days;
        switch (number)
        {
            case 1:
                System.out.println("january");
                break;
            case 3:
                System.out.println("march");
                break;
            case 5:
                System.out.println("may");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 10:
                System.out.println("october");
                break;
            case 12:
                System.out.println("december");
                days = 30;
                break;

            case 4 :
                System.out.println("april");
                break;

            case 6:
                System.out.println("june");
                break;

            case 9:
                System.out.println("september");
                break;

            case 11:
                System.out.println("november");
                days = 30;
                break;

            case 2:
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                days = 29;
            }
            else{
                days = 28;
            }
            default:
                System.out.println("Invalid");


        }


    }
}
