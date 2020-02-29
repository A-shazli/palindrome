package com.company;
import java.util.Scanner;
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(ANSI_RED+"THIS PROGRAM WILL TELL YOU WHETHER THE WORD YOU ENTER IS A PALINDROME OR NOT."+ ANSI_RESET);
                String a = new String();
        Scanner input = new Scanner(System.in);
        a = input.next();
        System.out.println(ANSI_PURPLE +"THE WORD YOU WISH TO CHECK FOR PALINDROME IS: " + a +ANSI_RESET) ;
        StringBuilder rev = new StringBuilder();
        rev.append(a);
        rev = rev.reverse();
        System.out.println(ANSI_PURPLE +"THE WORD REVERSED IS: " + rev+ ANSI_RESET);
        boolean eq1 = a.equalsIgnoreCase(rev.toString());
        System.out.println(eq1);
        if(eq1 == true) {
            System.out.println("WE HAVE A PALINDROME");
        }else if(eq1 == false)
            System.out.println("THE WORD IS NOT PALINDROMIC");

    }

}