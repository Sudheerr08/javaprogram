package org.Javatpoint_practice;

import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.sqrt;

public class Primenumber {
    void primetest(int a)
    {
        int count=0;
        for (int i =2;i<=a/2;i++) {
            if (a % i == 0) {
                count = count + 1;
             }
            }

            if (count>=1)
            {
                System.out.println(" Entered number "+a+" is not prime number.");
            }
            else
            {
                System.out.println(" Entered number "+a+" is a prime number.");
            }
        }

    void palindromtest(int a)
    {
        int c=a;
        int b, number=0;
       while(a>=1) {
           b = a % 10;
           number = number*10 + b;
           a = a / 10;
       }

       if (number==c)
       {
           System.out.println(" Entered number is a palindrome number");
       }
       else
       {
           System.out.println(" Entered number is not palindrome number");
       }
    }

    void factorial(int a)
    {
        int result=1;
        while(a>1)
        {
            result = result*a;
            a--;
        }
        System.out.println(" Factorail result is : "+result);
    }

     int factrecurssion(int n)
    {

        if (n==1)
        {return 1;}
        else
        {
            return (n*factrecurssion(n-1));
        }
    }

    void armstringtest(int n)
    {
        int temp =n,b;
        int result =0;
        while(n>0)
        {
            b=n%10;
            result = result+(b*b*b);
            n=n/10;

        }
        if(result==temp)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("number is not Armstrong");
        }
    }

    void sunnynumber(int a)
    {
        int n =a+1;
        double b = sqrt(n);
        double c = b*b;
        if(c==n)
        {
            System.out.println(" Number is sunny number"+a);
        }
        else
        {
            System.out.println("Number is not sunny"+a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int number = sc.nextInt();
        Primenumber pn = new Primenumber();
        pn.sunnynumber(number);

    }
}
