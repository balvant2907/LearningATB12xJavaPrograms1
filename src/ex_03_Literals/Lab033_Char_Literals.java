package ex_03_Literals;

import org.w3c.dom.ls.LSOutput;

public class Lab033_Char_Literals {
    public static void main(String[] args) {
        char A1='B';
        //char A2="B" this is not character its string

        char c2='B';
        char c3='@';
        char c4='$';
        char c5='&';
        char c6='%';
        char c7='(';

        //Escape character

        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        //Examples

        System.out.println("BalwantWangikar");
        System.out.println("Balwant"+new_line+"Wangikar");
        System.out.println("Balwant"+tab_line+"Wangikar");
        System.out.println("Balwant"+back_space+"Wangikar");

        System.out.println("Balwant"+carriage_return+"Wangikar");
        System.out.println("Balwant\tWangikar");

    }



}
