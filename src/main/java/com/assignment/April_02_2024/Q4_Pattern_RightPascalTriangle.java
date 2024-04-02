package com.assignment.April_02_2024;

import java.util.Scanner;

public class Q4_Pattern_RightPascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        RightPascalTriangle(rows);
    }

    public static void RightPascalTriangle(int rows){

        for (int i= 0; i<= rows-1 ; i++){
            for (int j=0; j<=i; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        for (int i=rows-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
    }
}
