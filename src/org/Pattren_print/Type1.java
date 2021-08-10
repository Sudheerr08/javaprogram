package org.Pattren_print;

import java.util.Scanner;

public class Type1 {
    void type1star(int a)
    {
        for (int i =0;i<a;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }


    void type2star(int a)
    {
        for (int i=a;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    void type3star(int row)
    {//outer loop works for row
        for ( int i=0;i<row;i++)
        {
            //inner loop works for space
            for( int j= 2*(row-i);j>=0;j--)
            {
                //print space between two stars
                System.out.print(" ");
            }
            //inner loop for column
            for(int k=0;k<=i;k++)
            {
                //print star
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void type4star(int row)
    {//outer loop works for row
        for ( int i=0;i<row;i++)
        {
            //inner loop works for space
            for( int j= (row-i);j>=0;j--)
            {
                //print space between two stars
                System.out.print(" ");
            }
            //inner loop for column
            for(int k=0;k<=i;k++)
            {
                //print star
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Type1 ty = new Type1();
         ty.type2star(n);
    }
}
