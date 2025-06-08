package ex_09_Switch;

public class Lab093_Switch {
    public static void main(String[] args) {
        char code = 'c';
        switch (code)
        {
            default :
                System.out.println("not match");
                break;

            case 1 :
                System.out.println("match");
                break;

            case 'B' :
                System.out.println("match");
                break;
        }

    }
}
