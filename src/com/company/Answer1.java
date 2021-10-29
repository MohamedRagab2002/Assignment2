package com.company;
import java.util.Scanner;
public class Answer1 {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter The Number");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        if (number%3==0&&(number&4)==0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("NO");
        }

    }
}
