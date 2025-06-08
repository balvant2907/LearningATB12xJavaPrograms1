package Practice_Tasks;

public class Lab004_Max_Between_Three_Numbers {

    public static void main(String[] args) {
        int N1=924;
        int N2=586;
        int N3=925;

        int result= (N1 > N2) ? ((N1 > N3) ?  N1 : N3 ) : ((N2 > N3) ? N2 : N3);
        System.out.println(result);

        //10    9  N1    N3    N1 > N3
    }
}
