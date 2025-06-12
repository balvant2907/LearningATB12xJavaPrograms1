package Tasks;

import java.util.Scanner;

public class Task10_Factorial_HR {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a value");
        int n=scanner.nextInt();
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;


        }
        System.out.println(fact);

    }
}
