package com.assignment.April_02_2024;

public class Q5_PlayWithNubersPattern {
    public static void main(String[] args) {

        printPattern(5);

    }
    public static void printPattern(int n)	{

        // the number of rows & columns to print
        int s = 2 * n-1;
        // upper half of matrix
        for (int i = 0;	i < (s / 2) + 1; i++)
        {
            int m = n;
            // the decreasing part
            for (int j = 0; j < i; j++)
            {
                System.out.print(m + " ");
                m--;
            }
            // the constant part
            for (int k = 0;	k < s-2 * i; k++)
            {
                System.out.print(n-i + " ");
            }
            // the increasing part.
            m = n-i + 1;
            for (int l = 0; l < i; l++)
            {
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
        // lower half of the matrix
        for (int i = s / 2-1;	i >= 0; i--)
        {
            // the decreasing part
            int m = n;
            for (int j = 0; j < i; j++)
            {
                System.out.print(m + " ");
                m--;
            }
            // the constant part.
            for (int k = 0;
                 k < s-2 * i; k++)
            {
                System.out.print(n-i + " ");
            }
            // the decreasing part
            m = n-i + 1;
            for (int l = 0; l < i; l++)
            {
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
    }


}
