package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
         float n1;
         float n2;
        System.out.println("please,enter the first num");
        n1 = in.nextFloat();
        System.out.println("please,enter the second num");
        n2= in.nextFloat();
        System.out.printf("num1 = %.2f \n num2 = %.2f \n" , n1, n2 );

    }
}
