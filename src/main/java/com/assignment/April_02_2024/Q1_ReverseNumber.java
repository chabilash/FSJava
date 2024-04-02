package com.assignment.April_02_2024;

import java.util.Scanner;

public class Q1_ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();
//        int num = 123;
//        int expOutput = 321;
        int reverseNum = reverse(num);
        System.out.println("Reverse of 123 is : "+reverseNum);


    }

    public static int reverse(int numb) {

        int rev = 0;
        int rem;

        while (numb > 0) {
            rem = numb % 10;
            rev = (rev * 10) + rem;
            numb = numb / 10;
        }

        return rev;
    }
}
