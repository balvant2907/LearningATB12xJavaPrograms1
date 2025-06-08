package ex_09_Switch;

public class Lab091_JDK13 {
    public static void main(String[] args) {
        int iteamcode = 002;
        switch (iteamcode)
        {
            case 001,002,003,004 :
                System.out.println(002);
                break;

            case 005,006,007 :
                System.out.println(006);
                break;

            default:
                System.out.println("Not Match");
        }
    }
}
