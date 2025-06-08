package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch_Real_Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a brower name");
        String browser =scanner.next();
        browser=browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("Tc--1");
                System.out.println("TC---02");
                break;

            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("Tc--1");
                System.out.println("TC---02");
                break;

            case "edge":
                System.out.println("Starting the edge");
                System.out.println("Tc--1");
                System.out.println("TC---02");
                break;

            default:
                System.out.println("This is not recognied browser");



        }
    }
}
