package com.assignment.April_02_2024;

import java.util.Scanner;

public class Q2_DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = scanner.nextInt();
        divisors(num);
    }

    public static void divisors(int num){

        System.out.print("Divisors of "+num+" are: ");
        for(int i = 1; i<num; i++) {
            if(num % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
